package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.Booking;
import com.web.movieTheater.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {
    @Autowired
    private BookingRepository repository;

    public Booking save(Booking booking) {
        return this.repository.save(booking);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<Booking> findAll() {
        return this.repository.findAll();
    }
    public Booking findById(Long id)
    {
        return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }

}
