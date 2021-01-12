package com.example.demo.model;


import java.util.List;

public class ListMovie {

    private List<MovieDto> movies;

    public ListMovie(List<MovieDto> movies) {
        this.movies = movies;
    }


    public List getMovies() {
        return movies;
    }
}
