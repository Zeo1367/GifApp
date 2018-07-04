package com.teamtreehouse.GifApp.model;

import java.time.LocalDate;

/**
 * Created by Zeo Dragoneel on 09-05-2017.
 */

public class Gif {

    private String name;
    private int categoryId;
    private LocalDate dateUploaded;
    private String userName;
    private boolean favorite;

    public Gif(String name,int categoryId, LocalDate dateUploaded, String userName, boolean favorite) {
        this.name = name;
        this.categoryId=categoryId;
        this.dateUploaded = dateUploaded;
        this.userName = userName;
        this.favorite = favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}