package com.web.movieTheater.repository;

import com.web.movieTheater.domain.PriceCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceCategoryRepository extends JpaRepository<PriceCategory, Long> {
}
