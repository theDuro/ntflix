package com.example.demo.repository;


import com.example.demo.model.MovieDto;

import java.util.List;

public interface MovieRepository {

    List<MovieDto> getMovies();

    void createDataBase();

}
