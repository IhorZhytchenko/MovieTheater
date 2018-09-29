package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.Cinema;
import com.web.movieTheater.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CinemaService {

    @Autowired
    private CinemaRepository repository;

    public Cinema save(Cinema cinema) {
        return this.repository.save(cinema);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<Cinema> findAll() {
        return this.repository.findAll();
    }
    public Cinema findById(Long id)
    {
       return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }
}
