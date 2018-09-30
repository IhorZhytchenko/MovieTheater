package com.web.movieTheater.controler;

import com.web.movieTheater.service.jpa.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CinemaHallController extends BaseSecurityController {
    @Autowired
    private CinemaHallService service;

}
