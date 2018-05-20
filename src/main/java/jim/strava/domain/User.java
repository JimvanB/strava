
package jim.strava.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "username",
    "resource_state",
    "firstname",
    "lastname",
    "city",
    "state",
    "country",
    "sex",
    "premium",
    "created_at",
    "updated_at",
    "badge_type_id",
    "profile_medium",
    "profile",
    "friend",
    "follower",
    "email",
    "follower_count",
    "friend_count",
    "mutual_friend_count",
    "athlete_type",
    "date_preference",
    "measurement_preference",
    "clubs",
    "ftp",
    "weight",
    "bikes",
    "shoes"
})
//@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dbIb;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("premium")
    private Boolean premium;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("badge_type_id")
    private Integer badgeTypeId;
    @JsonProperty("profile_medium")
    private String profileMedium;
    @JsonProperty("profile")
    private String profile;
    @JsonProperty("friend")
    private String friend;
    @JsonProperty("follower")
    private String follower;
    @JsonProperty("email")
    private String email;
    @JsonProperty("follower_count")
    private Integer followerCount;
    @JsonProperty("friend_count")
    private Integer friendCount;
    @JsonProperty("mutual_friend_count")
    private Integer mutualFriendCount;
    @JsonProperty("athlete_type")
    private Integer athleteType;
    @JsonProperty("date_preference")
    private String datePreference;
    @JsonProperty("measurement_preference")
    private String measurementPreference;
    @JsonProperty("clubs")
    @OneToMany
    private List<Club> clubs = new ArrayList<>();
    @JsonProperty("ftp")
    private Integer ftp;
    @JsonProperty("weight")
    private Double weight;
    @JsonProperty("bikes")
    @OneToMany
    private List<Bike> bikes= new ArrayList<>();
    @JsonProperty("shoes")
    @OneToMany
    private List<Shoe> shoes = new ArrayList<>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("premium")
    public Boolean getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("badge_type_id")
    public Integer getBadgeTypeId() {
        return badgeTypeId;
    }

    @JsonProperty("badge_type_id")
    public void setBadgeTypeId(Integer badgeTypeId) {
        this.badgeTypeId = badgeTypeId;
    }

    @JsonProperty("profile_medium")
    public String getProfileMedium() {
        return profileMedium;
    }

    @JsonProperty("profile_medium")
    public void setProfileMedium(String profileMedium) {
        this.profileMedium = profileMedium;
    }

    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @JsonProperty("friend")
    public Object getFriend() {
        return friend;
    }

    @JsonProperty("friend")
    public void setFriend(String friend) {
        this.friend = friend;
    }

    @JsonProperty("follower")
    public Object getFollower() {
        return follower;
    }

    @JsonProperty("follower")
    public void setFollower(String follower) {
        this.follower = follower;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("follower_count")
    public Integer getFollowerCount() {
        return followerCount;
    }

    @JsonProperty("follower_count")
    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    @JsonProperty("friend_count")
    public Integer getFriendCount() {
        return friendCount;
    }

    @JsonProperty("friend_count")
    public void setFriendCount(Integer friendCount) {
        this.friendCount = friendCount;
    }

    @JsonProperty("mutual_friend_count")
    public Integer getMutualFriendCount() {
        return mutualFriendCount;
    }

    @JsonProperty("mutual_friend_count")
    public void setMutualFriendCount(Integer mutualFriendCount) {
        this.mutualFriendCount = mutualFriendCount;
    }

    @JsonProperty("athlete_type")
    public Integer getAthleteType() {
        return athleteType;
    }

    @JsonProperty("athlete_type")
    public void setAthleteType(Integer athleteType) {
        this.athleteType = athleteType;
    }

    @JsonProperty("date_preference")
    public String getDatePreference() {
        return datePreference;
    }

    @JsonProperty("date_preference")
    public void setDatePreference(String datePreference) {
        this.datePreference = datePreference;
    }

    @JsonProperty("measurement_preference")
    public String getMeasurementPreference() {
        return measurementPreference;
    }

    @JsonProperty("measurement_preference")
    public void setMeasurementPreference(String measurementPreference) {
        this.measurementPreference = measurementPreference;
    }

    @JsonProperty("clubs")
    public List<Club> getClubs() {
        return clubs;
    }

    @JsonProperty("clubs")
    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    @JsonProperty("ftp")
    public Integer getFtp() {
        return ftp;
    }

    @JsonProperty("ftp")
    public void setFtp(Integer ftp) {
        this.ftp = ftp;
    }

    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @JsonProperty("bikes")
    public List<Bike> getBikes() {
        return bikes;
    }

    @JsonProperty("bikes")
    public void setBikes(List<Bike> bikes) {
        this.bikes = bikes;
    }

    @JsonProperty("shoes")
    public List<Shoe> getShoes() {
        return shoes;
    }

    @JsonProperty("shoes")
    public void setShoes(List<Shoe> shoes) {
        this.shoes = shoes;
    }

    public Long getDbIb() {
        return dbIb;
    }

    public void setDbIb(Long dbIb) {
        this.dbIb = dbIb;
    }
}
