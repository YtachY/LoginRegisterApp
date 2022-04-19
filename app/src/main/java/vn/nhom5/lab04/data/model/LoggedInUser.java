package vn.nhom5.lab04.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */

public class LoggedInUser {

    private String userId;
    private String name;
    private String userEmail;
    private String password;

    public LoggedInUser() {
    }

    public LoggedInUser(String userId, String name, String userEmail, String password) {
        this.userId = userId;
        this.name = name;
        this.userEmail = userEmail;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}