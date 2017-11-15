package com.neto.accounting.accounting.DAO;

import com.neto.accounting.accounting.model.Employer;

import java.util.List;

/**
 * Created by wande on 27/10/2017.
 */
public interface EmployerDAOLocal {

    public void addEmployer(Employer e);
    public void updateEmployer(Employer e);
    public List<Employer> listEmployers();
    public Employer getEmployerById(int id);
    public void removeEmployer(int id);

}
