package com.web.movieTheater.repository;

import com.web.movieTheater.domain.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
