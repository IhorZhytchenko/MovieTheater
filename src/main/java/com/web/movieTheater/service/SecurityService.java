package com.web.movieTheater.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class SecurityService {

    public ModelAndView createModelAndView(String viewName) {
        ModelAndView result = new ModelAndView(viewName);
//        result.addObject("curUser", getUser());

        return result;
    }

}
