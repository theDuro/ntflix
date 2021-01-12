package com.example.demo.repository.impl;

import com.example.demo.model.ListMovie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;
import com.example.demo.service.impl.MovieRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    private ListMovie listMovie;

    public MovieServiceImpl() {
        movieRepository = new MovieRepositoryImpl();
        listMovie = new ListMovie(movieRepository.getMovies());
    }


    @Override
    public ListMovie getDataBase() {
        return listMovie;
    }
}
