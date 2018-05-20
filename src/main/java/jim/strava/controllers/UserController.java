package jim.strava.controllers;

import jim.strava.domain.AuthorizedStravaUser;
import jim.strava.domain.StravaResponse;
import jim.strava.domain.User;
//import jim.strava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jim on 4-4-18.
 */
@RestController
public class UserController {

    //private UserRepository userRepository;
    private String stravaId;
    private String stravaSecret;

    public UserController( @Value("${strava_client_id}") String stravaClient, @Value("${strava_client_secret}") String stravaSecret) {
      //  this.userRepository = userRepository;
        this.stravaId = stravaClient;
        this.stravaSecret = stravaSecret;
    }

//https://www.strava.com/oauth/authorize?client_id=24628&response_type=code&redirect_uri=http://localhost:8080/exchange_token&approval_prompt=force&scope=public

    @GetMapping("/newuser")
    public String newuser() {
        return null;
    }

    @GetMapping(value = "/exchange_token", produces = "application/json")
    public String gettoken(@RequestParam("code") String code, @RequestParam("state") String state) {
        StravaResponse stravaResponse = new StravaResponse(code, state);
        RestTemplate restTemplate = new RestTemplate();
        AuthorizedStravaUser result = restTemplate.postForEntity("https://www.strava.com/oauth/token?client_id="+stravaId+"&client_secret="+stravaSecret+"&code=" + stravaResponse.getCode(), null, AuthorizedStravaUser.class).getBody();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","Bearer "+result.getAccess_token());

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        User userResult = restTemplate.exchange("https://www.strava.com/api/v3/athlete", HttpMethod.GET, entity, User.class).getBody();

        System.out.println(result);
    //    userRepository.save(userResult);
        return userResult.toString();
    }

}
