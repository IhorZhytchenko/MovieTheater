package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.BookingType;
import com.web.movieTheater.domain.Cinema;
import com.web.movieTheater.repository.BookingTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingTypeService {
    @Autowired
    private BookingTypeRepository repository;

    public BookingType save(BookingType bookingType) {
        return this.repository.save(bookingType);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<BookingType> findAll() {
        return this.repository.findAll();
    }
    public BookingType findById(Long id)
    {
        return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }

    public BookingType findByType(String type) {
        return this.repository.findByType(type);
    }
}
