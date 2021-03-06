package com.sallefy.service.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * A DTO for status of following entity.
 */
@ApiModel(value = "Follow")
public class FollowDTO implements Serializable {

    private boolean followed;

    public FollowDTO() {
    }

    public FollowDTO(boolean followed) {
        this.followed = followed;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}
