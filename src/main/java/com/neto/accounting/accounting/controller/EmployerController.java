package com.neto.accounting.accounting.controller;

import com.neto.accounting.accounting.model.Employer;
import com.neto.accounting.accounting.model.TypeWorkEnum;
import com.neto.accounting.accounting.repository.EmployerRepository;
import com.neto.accounting.accounting.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.EnumSet;
import java.util.List;

/**
 * Created by wande on 27/10/2017.
 */
@Controller
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/employer")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("/employer");
        mv.addObject("employers", employerService.findAll());
        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Employer employer) {

        ModelAndView mv = new ModelAndView("/newEmployer");
        mv.addObject("employer", employer);
        mv.addObject("typesWork", EnumSet.allOf(TypeWorkEnum.class));
        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") int id) {

        return add(employerService.findOne(id));
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {

        employerService.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Employer employer, BindingResult result) {
        if(result.hasErrors()) {
            return add(employer);
        }
        employerService.save(employer);
        return findAll();
    }
}
