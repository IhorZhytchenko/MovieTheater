package com.web.movieTheater.repository;

import com.web.movieTheater.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    Booking findBookingByVideoSessionIdAndSeatId (Long videoSessionId, Long seatId);
    @Query(nativeQuery = true, value =
            "SELECT EXISTS (SELECT * FROM booking WHERE video_session_id = :videoSessionId AND seat_id = :seatId)")
    boolean existsBookingByVideoSessionIdAndSeatId(@Param("videoSessionId") Long videoSessionId, @Param("seatId") Long seatId);

}
