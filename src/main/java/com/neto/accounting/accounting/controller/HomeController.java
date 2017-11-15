package com.neto.accounting.accounting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wande on 15/11/2017.
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("/home");
        //mv.addObject("employers", employerRepository.findAll());
        return mv;
    }


}
