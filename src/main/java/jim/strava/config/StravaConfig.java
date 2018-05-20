package jim.strava.config;

import javastrava.api.v3.auth.AuthorisationService;
import javastrava.api.v3.auth.impl.retrofit.AuthorisationServiceImpl;
import javastrava.api.v3.auth.model.Token;
import javastrava.api.v3.service.Strava;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jim on 4-4-18.
 */
@Configuration
public class StravaConfig {

    @Bean
    public Strava getStrava(){
        AuthorisationService service = new AuthorisationServiceImpl();
       // Token token = service.tokenExchange({application_client_id}, {client_secret}, code);
        return null;
    }


}
