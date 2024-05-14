package com.movie.model;

import java.io.Serializable;

public class MovieItem implements Serializable {
    private String title;
    private String year;
    private String genre;

    public MovieItem(String title, String year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}
