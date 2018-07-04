package com.teamtreehouse.GifApp.model;

import static org.apache.coyote.http11.Constants.a;

/**
 * Created by Zeo Dragoneel on 09-05-2017.
 */
public class Category {
    private int id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
