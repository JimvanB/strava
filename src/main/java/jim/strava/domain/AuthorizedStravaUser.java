package jim.strava.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jim on 4-4-18.
 */

public class AuthorizedStravaUser {
    Long id;
    String access_token;
    String token_type;
    @JsonProperty("athlete")
    StravaUser stravaUser;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public StravaUser getStravaUser() {
        return stravaUser;
    }

    public void setStravaUser(StravaUser stravaUser) {
        this.stravaUser = stravaUser;
    }
}
