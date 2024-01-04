package com.amazonclone.user_service.dto;

import com.amazonclone.user_service.entity.UserData;

import java.util.Objects;

public class UserDataDto {

    private Long id;
    private String name;
    private String username;
    private String emailId;

    public UserDataDto() {
    }

    public UserDataDto(Long id, String name, String username, String emailId) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.emailId = emailId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDataDto that = (UserDataDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(username, that.username) && Objects.equals(emailId, that.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, emailId);
    }
}




