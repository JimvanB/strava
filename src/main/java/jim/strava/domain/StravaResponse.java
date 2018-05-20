package jim.strava.domain;

/**
 * Created by jim on 4-4-18.
 */
public class StravaResponse {

    private String code;
    private String state;

    public StravaResponse(String code, String state) {
        this.code = code;
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "StravaResponse{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
