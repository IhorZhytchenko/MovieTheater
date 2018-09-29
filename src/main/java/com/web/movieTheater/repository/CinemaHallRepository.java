package com.web.movieTheater.repository;

import com.web.movieTheater.domain.CinemaHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaHallRepository extends JpaRepository<CinemaHall, Long> {

}
