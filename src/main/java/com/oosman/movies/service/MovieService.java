package com.oosman.movies.service;

import com.oosman.movies.Movie;
import com.oosman.movies.repos.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;

    public List<Movie> allMovies() {
        return movieRepo.findAll();
    }

    public Optional<Movie> getMovie(String id) {
        return movieRepo.findMovyeByImdbId(id);
    }
}
