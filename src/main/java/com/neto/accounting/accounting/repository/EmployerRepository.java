package com.neto.accounting.accounting.repository;

import com.neto.accounting.accounting.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wande on 27/10/2017.
 */
@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer> {

}
