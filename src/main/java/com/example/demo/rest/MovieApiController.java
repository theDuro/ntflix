package com.example.demo.rest;

import com.example.demo.model.ListMovie;
import com.example.demo.service.MovieService;
import com.example.demo.repository.impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieApiController {


    @Autowired
    private MovieService movieService = new MovieServiceImpl();


    @CrossOrigin
    @GetMapping("/movies")
    public ResponseEntity<ListMovie> getMovies(){


        return new ResponseEntity<>( movieService.getDataBase() , HttpStatus.OK);
    }

}
