package com.rozkurt.Security.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String firstName;

    private String middleName;

    private String lastName;

    private String password;

    private Boolean isActive;

    private Boolean isRevoke;

    private ZonedDateTime createdTime;

    protected User(Long id,
                String email,
                String firstName,
                String middleName,
                String lastName,
                String password,
                Boolean isActive,
                Boolean isRevoke,
                ZonedDateTime createdTime) {

        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.password = password;
        this.isActive = isActive;
        this.isRevoke = isRevoke;
        this.createdTime = createdTime;
    }

    protected User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getRevoke() {
        return isRevoke;
    }

    public void setRevoke(Boolean revoke) {
        isRevoke = revoke;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

}
