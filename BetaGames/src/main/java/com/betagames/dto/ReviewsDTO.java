package com.betagames.dto;

import java.util.Date;

/**
 *
 * @author Fabrini Marco
 */
public class ReviewsDTO {
    private Integer id;
    private UsersDTO username;
    private Integer score;
    private String description;
    private Date createdAt;

    public ReviewsDTO(Integer id, UsersDTO username, Integer score, String description, Date createdAt) {
        this.id = id;
        this.username = username;
        this.score = score;
        this.description = description;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public UsersDTO getUsername() {
        return username;
    }

    public void setUsername(UsersDTO username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ReviewsDTO [id=" + id + ", score=" + score + ", description=" + description + ", createdAt=" + createdAt
                + "]";
    }

}// class
