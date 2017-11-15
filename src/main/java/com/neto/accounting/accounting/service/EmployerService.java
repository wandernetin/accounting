package com.neto.accounting.accounting.service;

import com.neto.accounting.accounting.model.Employer;
import com.neto.accounting.accounting.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wande on 27/10/2017.
 */
@Service
public class EmployerService  {

    @Autowired
    private EmployerRepository employerRepository;

    public List<Employer> findAll() {
        return employerRepository.findAll();
    }

    public Employer findOne(Integer id) {
        return employerRepository.findOne(id);
    }

    public Employer save (Employer employer) {
        return employerRepository.saveAndFlush(employer);
    }

    public void delete(Integer id) {
        employerRepository.delete(id);
    }

}
