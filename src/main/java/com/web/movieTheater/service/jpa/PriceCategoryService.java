package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.Cinema;
import com.web.movieTheater.domain.PriceCategory;
import com.web.movieTheater.repository.PriceCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCategoryService {

    @Autowired
    private PriceCategoryRepository repository;

    public PriceCategory save(PriceCategory priceCategory) {
        return this.repository.save(priceCategory);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<PriceCategory> findAll() {
        return this.repository.findAll();
    }
    public PriceCategory findById(Long id)
    {
        return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }

}
