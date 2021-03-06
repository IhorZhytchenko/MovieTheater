package com.web.movieTheater.controler;


import com.web.movieTheater.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseSecurityController {
    @Autowired
    private SecurityService service;

    public ModelAndView createModelAndView(String viewName) {
        return this.service.createModelAndView(viewName);
    }

}
