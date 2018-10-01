package com.web.movieTheater.controler;

import com.web.movieTheater.domain.Seat;
import com.web.movieTheater.service.jpa.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SeatController extends BaseSecurityController {
    @Autowired
    private SeatService service;

    @RequestMapping(path = "/session/bookedSeats", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<Seat> getBookedSeat(@RequestParam long vsId) {
        return this.service.getAllBookingByVideoSessionId(vsId);
    }

}
