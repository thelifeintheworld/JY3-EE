package com.test.pojo;

public class User {
    private  String username;
    private  String psw;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }

    public User(String username, String psw) {
        this.username = username;
        this.psw = psw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
