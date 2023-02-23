package com.rozkurt.Security.entity;

import java.time.ZonedDateTime;

public class UserBuilder {
    private Long id;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private Boolean isActive;
    private Boolean isRevoke;
    private ZonedDateTime createdTime;

    public UserBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public UserBuilder setIsRevoke(Boolean isRevoke) {
        this.isRevoke = isRevoke;
        return this;
    }

    public UserBuilder setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public User createUser() {
        return new User(id, email, firstName, middleName, lastName, password, isActive, isRevoke, createdTime);
    }
}