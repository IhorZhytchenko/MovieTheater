package com.web.movieTheater.controler;

import com.web.movieTheater.service.jpa.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController extends BaseSecurityController {
    @Autowired
    private MovieService service;


    @GetMapping("/")
    public ModelAndView getEmployees() {
        ModelAndView modelAndView = createModelAndView("movies");
        modelAndView.addObject("movies", this.service.findAll());
        return modelAndView;
    }
}
