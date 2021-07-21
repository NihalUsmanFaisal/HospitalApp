package com.puttuboi.EurekaClient.model;

import com.puttuboi.EurekaClient.model.base.AuditableEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends AuditableEntity {

    @Column
    private String userName;

    @Column
    private int gender;

    @Column
    private String email;

    @Column
    private String profilePicture;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
