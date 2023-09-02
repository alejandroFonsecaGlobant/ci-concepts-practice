package org.example;

public class UserEnvironment {
    private String userDomain;
    private String username;
    public UserEnvironment() {
        this.userDomain = System.getenv("USERDOMAIN");
        this.username = System.getenv("USERNAME");
    }

    public String getUserDomain() {
        return userDomain;
    }

    public String getUsername() {
        return username;
    }
}
