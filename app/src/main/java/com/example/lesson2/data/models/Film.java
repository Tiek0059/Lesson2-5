package com.example.lesson2.data.models;

import com.google.gson.annotations.SerializedName;

public class Film {
    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("director")
    private String director;

    @SerializedName("original_title")
    private String originalTitle;

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                '}';
    }
}
