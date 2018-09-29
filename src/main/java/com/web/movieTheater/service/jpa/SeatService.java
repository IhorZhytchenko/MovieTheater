package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.PriceCategory;
import com.web.movieTheater.domain.Seat;
import com.web.movieTheater.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepository repository;

    public Seat save(Seat seat) {
        return this.repository.save(seat);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<Seat> findAll() {
        return this.repository.findAll();
    }
    public Seat findById(Long id)
    {
        return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }
}
