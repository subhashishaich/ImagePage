package ImageHoster.model;


public class UserProfile {

    private Integer id;
    private String fullName;
    private String emailAddress;
    private String mobileNumber;


    //Generate getters and setters for all the attributes


    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}