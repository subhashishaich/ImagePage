package ImageHoster.model;


public class User {

    private Integer id;
    private String username;
    private String password;
    private UserProfile profile;

    //Generate getters and setters for all the attributes

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public boolean LoginUser(){
        boolean RetValue = false;
        if (this.username.equals("upgrad") &&
        this.password.equals("password")) {
            RetValue = true;
        }
        else {
            RetValue = false;
        }
      //  System.out.println(RetValue);
        return RetValue;
    }
}