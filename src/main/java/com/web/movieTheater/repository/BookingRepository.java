package com.web.movieTheater.repository;

import com.web.movieTheater.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    Booking findBookingByVideoSessionIdAndSeatId (Long videoSessionId, Long seatId);

}
