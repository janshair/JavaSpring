package com.tapdevs.backend.model;

/**
 * Created by Tapdevs on 16/02/2017.
 */
public class User {

    private long id;
    private String fullName,userName,password,email;

    public User() {

    }

    public User(long id, String fullName, String password, String email) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
