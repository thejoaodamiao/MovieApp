package com.jd.movieapp.model;

import com.google.gson.annotations.SerializedName;

public class Genre {
    @SerializedName("genre_id")
    private Integer id;
    @SerializedName("genre_name")
    private String genre_name;

    public Genre(int id,String genre_name )
    {
        this.id = id;
        this.genre_name=genre_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }
}
