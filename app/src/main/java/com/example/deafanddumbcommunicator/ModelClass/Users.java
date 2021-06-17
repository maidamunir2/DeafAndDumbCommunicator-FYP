package com.example.deafanddumbcommunicator.ModelClass;

import java.io.Serializable;

public class Users {

    private String name, phone, password, profileImg;

    public Users() {
    }

    public Users(String name, String phone, String password, String profileImg) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.profileImg = profileImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }
}
