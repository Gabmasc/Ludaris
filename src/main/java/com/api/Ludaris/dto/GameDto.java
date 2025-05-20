package com.api.Ludaris.dto;

import com.api.Ludaris.entities.Game;

public class GameDto {

    private Long id;
    private String title;
    private String platform;
    private Double score;
    private String imgUrl;
    private String shortDescription;

    public GameDto() {
    }

    public GameDto(Game gameEntity) {
        id = gameEntity.getId();
        title = gameEntity.getTitle();
        platform = gameEntity.getPlatform();
        score = gameEntity.getScore();
        imgUrl = gameEntity.getImgUrl();
        shortDescription = gameEntity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
