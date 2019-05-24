package com.test.pojo;

public class User {
    private Integer userid;
    private String username;
    private  String psw;

    public User() {
    }

    public User(Integer userid, String username, String psw) {
        this.userid = userid;
        this.username = username;
        this.psw = psw;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
