package com.progy.elan.retrofitget;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;

    private int id;

    private String title;
    //ako JSON key-ot i promenlivata se so razlicno ime se pravi serialized name
    //odnosno ova posocuva na body vo JSON
    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
