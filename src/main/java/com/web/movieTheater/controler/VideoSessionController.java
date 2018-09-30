package com.web.movieTheater.controler;

import com.web.movieTheater.domain.Seat;
import com.web.movieTheater.domain.VideoSession;
import com.web.movieTheater.service.HallSeatsService;
import com.web.movieTheater.service.jpa.VideoSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.TreeSet;

@Controller
public class VideoSessionController extends BaseSecurityController {
    @Autowired
    private VideoSessionService service;
    @Autowired
    private HallSeatsService hallSeatsService;


    @GetMapping("/session")
    public ModelAndView getSessionByVideoId(@RequestParam long id) {
        ModelAndView modelAndView = createModelAndView("videoSession");
        modelAndView.addObject("sessions", this.service.findByVideoId(id));
        return modelAndView;
    }

    @GetMapping("/session/hall")
    public ModelAndView getSessionSeats(@RequestParam long id) {
        ModelAndView modelAndView = createModelAndView("sessionSeats");
        VideoSession session = this.service.findById(id);
        List<TreeSet<Seat>> seats = this.hallSeatsService.getAllHallSeats(session.getCinemaHall().getId());
        modelAndView.addObject("vSession", session);
        modelAndView.addObject("seats", seats);
        return modelAndView;
    }

}
