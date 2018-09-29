package com.web.movieTheater.repository;

import com.web.movieTheater.domain.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    @Query(nativeQuery = true, value =
            "SELECT * FROM seat AS s JOIN booking AS b ON s.id = b.seat_id JOIN video_session AS vs ON vs.id = b.videoSession_id WHERE b.bookingType_id = 1 AND vs.id = :vsId")
    List<Seat> getAllBookingByVideoSession(@Param("vsId") Long vsId);
}
