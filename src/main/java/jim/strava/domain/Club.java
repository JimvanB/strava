
package jim.strava.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "resource_state",
    "name",
    "profile_medium",
    "profile",
    "cover_photo",
    "cover_photo_small",
    "sport_type",
    "city",
    "state",
    "country",
    "private",
    "member_count",
    "featured",
    "verified",
    "url",
    "membership",
    "admin",
    "owner"
})
@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dbIb;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("name")
    private String name;
    @JsonProperty("profile_medium")
    private String profileMedium;
    @JsonProperty("profile")
    private String profile;
    @JsonProperty("cover_photo")
    private String coverPhoto;
    @JsonProperty("cover_photo_small")
    private String coverPhotoSmall;
    @JsonProperty("sport_type")
    private String sportType;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("member_count")
    private Integer memberCount;
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("url")
    private String url;
    @JsonProperty("membership")
    private String membership;
    @JsonProperty("admin")
    private Boolean admin;
    @JsonProperty("owner")
    private Boolean owner;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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

    @JsonProperty("cover_photo")
    public String getCoverPhoto() {
        return coverPhoto;
    }

    @JsonProperty("cover_photo")
    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    @JsonProperty("cover_photo_small")
    public String getCoverPhotoSmall() {
        return coverPhotoSmall;
    }

    @JsonProperty("cover_photo_small")
    public void setCoverPhotoSmall(String coverPhotoSmall) {
        this.coverPhotoSmall = coverPhotoSmall;
    }

    @JsonProperty("sport_type")
    public String getSportType() {
        return sportType;
    }

    @JsonProperty("sport_type")
    public void setSportType(String sportType) {
        this.sportType = sportType;
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

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("member_count")
    public Integer getMemberCount() {
        return memberCount;
    }

    @JsonProperty("member_count")
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    @JsonProperty("featured")
    public Boolean getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("membership")
    public String getMembership() {
        return membership;
    }

    @JsonProperty("membership")
    public void setMembership(String membership) {
        this.membership = membership;
    }

    @JsonProperty("admin")
    public Boolean getAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @JsonProperty("owner")
    public Boolean getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

}
