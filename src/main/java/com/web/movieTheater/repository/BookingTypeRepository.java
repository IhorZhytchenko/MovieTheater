package com.web.movieTheater.repository;

import com.web.movieTheater.domain.BookingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingTypeRepository extends JpaRepository<BookingType, Long> {

    BookingType findByType(String type);
}
