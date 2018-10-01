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
    @Autowired
    private SeatService seatService;
    @Autowired
    private VideoSessionService videoSessionService;
    @Autowired
    private UserService userService;
    @Autowired
    private BookingTypeService bookingTypeService;



    public Booking saveBookingIfNotExists(Long videoSessionId, Long seatId, Long userId) {
        Booking booking = null;
        if (!(this.existsByVideoSessionIdAndSeatId(videoSessionId, seatId))) {
            booking = new Booking();
            booking.setSeat(this.seatService.findById(seatId));
            booking.setVideoSession(this.videoSessionService.findById(videoSessionId));
            booking.setUser(this.userService.findById(userId));
            booking.setBookingType(this.bookingTypeService.findByType("booked"));
            booking = this.save(booking);
        }

        return booking;
    }
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
    public boolean existsByVideoSessionIdAndSeatId(Long videoSessionId, Long seatId) {
        return this.repository.existsBookingByVideoSessionIdAndSeatId(videoSessionId, seatId);
    }

}
