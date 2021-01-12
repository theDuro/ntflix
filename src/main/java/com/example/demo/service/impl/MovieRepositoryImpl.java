package com.example.demo.service.impl;

import com.example.demo.model.MovieDto;
import com.example.demo.repository.MovieRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private List<MovieDto> movieDateBase;

    private MovieDto movieDto;

    public MovieRepositoryImpl() {
        createDataBase();
    }

    public List getMovies() {
        return new ArrayList<>(movieDateBase);
    }

    @Override
    public void createDataBase() {
        movieDateBase = new ArrayList<>();

        movieDateBase.add(movieDto = new MovieDto(1,"Piraci z krzemowej doliny",1999,"https://fwcdn.pl/fpo/30/02/33002/6988507.6.jpg"));
        movieDateBase.add(movieDto = new MovieDto(2,"Ja, robot",2004,"https://fwcdn.pl/fpo/54/92/95492/7521206.6.jpg"));
        movieDateBase.add(movieDto = new MovieDto(3,"Kod nieśmiertelności",2011,"https://fwcdn.pl/fpo/89/67/418967/7370853.6.jpg"));
        movieDateBase.add(movieDto = new MovieDto(4,"Ex Machina",2015,"https://fwcdn.pl/fpo/64/19/686419/7688121.6.jpg"));
    }


}
