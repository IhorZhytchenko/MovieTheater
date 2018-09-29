package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.Cinema;
import com.web.movieTheater.domain.CinemaHall;
import com.web.movieTheater.repository.CinemaHallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaHallService {
    @Autowired
    private CinemaHallRepository repository;

    public CinemaHall save(CinemaHall cinemaHall) {
        return this.repository.save(cinemaHall);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<CinemaHall> findAll() {
        return this.repository.findAll();
    }
    public CinemaHall findById(Long id)
    {
        return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }

}
