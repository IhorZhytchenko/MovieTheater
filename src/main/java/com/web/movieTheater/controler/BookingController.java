package com.web.movieTheater.controler;

import com.web.movieTheater.domain.Booking;
import com.web.movieTheater.domain.Seat;
import com.web.movieTheater.service.jpa.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookingController extends BaseSecurityController {
    @Autowired
    private BookingService service;

    @RequestMapping(path = "/session/booking", method = RequestMethod.POST,  produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Booking getBookedSeat(@RequestParam long vsId, @RequestParam long seatId, @RequestParam long userId) {
        return this.service.saveBookingIfNotExists(vsId, seatId, userId);
    }

    @RequestMapping(path = "/session/booking/delete", method = RequestMethod.POST,  produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Long delBooking(@RequestParam long bookingId) {
        return this.service.deleteWithSeatIdReturn(bookingId);
    }

    @RequestMapping(path = "/session/booking/sold", method = RequestMethod.POST)
    @ResponseBody
    public boolean changeBookingTypeToSold(@RequestParam Long bookingId) {
           this.service.changeBookingTypeToSold(bookingId);
           return true;

    }

}
