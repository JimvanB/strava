package jim.strava.controllers;

import jim.strava.converter.AuthorizedUserToAppUser;
import jim.strava.domain.Activity;
import jim.strava.domain.AuthorizedStravaUser;
import jim.strava.domain.StravaResponse;
import jim.strava.domain.User;
import jim.strava.entity.AppUser;
import jim.strava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

//import jim.strava.repository.UserRepository;

/**
 * Created by jim on 4-4-18.
 */
@RestController
public class UserController {

    private UserRepository userRepository;
    private String stravaId;
    private String stravaSecret;
    private String token;

    public UserController( @Value("${strava_client_id}") String stravaClient, @Value("${strava_client_secret}") String stravaSecret, UserRepository userRepository) {
        this.userRepository = userRepository;
        this.stravaId = stravaClient;
        this.stravaSecret = stravaSecret;
    }

//https://www.strava.com/oauth/authorize?client_id=24628&response_type=code&redirect_uri=http://localhost:8080/exchange_token&approval_prompt=force&scope=public

    @GetMapping("/welcome")
    public String welcome() {
        return "success";
    }

    @GetMapping(value = "/exchange_token", produces = "application/json")
    public ResponseEntity gettoken(@RequestParam("code") String code, @RequestParam("state") String state) {
        StravaResponse stravaResponse = new StravaResponse(code, state);
        RestTemplate restTemplate = new RestTemplate();
        AuthorizedStravaUser result = restTemplate.postForEntity("https://www.strava.com/oauth/token?client_id="+stravaId+"&client_secret="+stravaSecret+"&code=" + stravaResponse.getCode(), null, AuthorizedStravaUser.class).getBody();
       /* HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","Bearer "+result.getAccess_token());

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        User userResult = restTemplate.exchange("https://www.strava.com/api/v3/athlete", HttpMethod.GET, entity, User.class).getBody();

        //1631232808
        String string = restTemplate.exchange("https://www.strava.com/api/v3/activities/1631232808", HttpMethod.GET, entity, String.class).getBody();
        String string2 = restTemplate.exchange("https://www.strava.com/api/v3/activities/1631232808/streams?keys=latlng&key_by_type=", HttpMethod.GET, entity, String.class).getBody();
        System.out.println(result);*/


    //    userRepository.save(userResult);
        AppUser newUser = AuthorizedUserToAppUser.convert(result);
        token = newUser.getToken();
        userRepository.save(newUser);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/welcome"));
        return new ResponseEntity<Void>(headers, HttpStatus.MOVED_PERMANENTLY);
    }

    @GetMapping(value = "/activities", produces = "application/json")
    public List<Activity> getActivities() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","Bearer "+token);

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        Activity[] result = restTemplate.exchange("https://www.strava.com/api/v3/athlete/activities", HttpMethod.GET, entity, new Activity[0].getClass()).getBody();

        return Arrays.asList(result);
    }

}
