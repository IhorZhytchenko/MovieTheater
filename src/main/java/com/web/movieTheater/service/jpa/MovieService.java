package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.Movie;
import com.web.movieTheater.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public Movie save(Movie movie) {
        return this.repository.save(movie);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<Movie> findAll() {
        return this.repository.findAll();
    }
    public Movie findById(Long id)
    {
        return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }
}
