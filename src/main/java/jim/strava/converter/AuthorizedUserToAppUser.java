package jim.strava.converter;

import jim.strava.domain.AuthorizedStravaUser;
import jim.strava.entity.AppUser;

/**
 * Created by jim on 13-6-18.
 */
public class AuthorizedUserToAppUser {


    public static AppUser convert(AuthorizedStravaUser user){
        return new AppUser(user.getStravaUser().getName(),user.getStravaUser().getEmail(),user.getAccess_token());
    }


}
