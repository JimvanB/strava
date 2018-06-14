package jim.strava.entity;


import javax.persistence.*;

/**
 * Created by jim on 13-6-18.
 */

@Entity
@Table(name = "users")
public class AppUser {

    public AppUser() {
    }

    public AppUser(String name, String email, String token) {
        this.name = name;
        this.email = email;
        this.token = token;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    @Column(name = "token")
    String token;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
