package com.neto.accounting.accounting.DAO;

import com.neto.accounting.accounting.model.Employer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wande on 27/10/2017.
 */
@Repository
public class EmployerDAO implements EmployerDAOLocal {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }


    @Override
    public void addEmployer(Employer e) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(e);
    }

    @Override
    public void updateEmployer(Employer e) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(e);
    }

    @Override
    public List<Employer> listEmployers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Employer> employerList = session.createQuery("from Employer").list();
        return employerList;
    }

    @Override
    public Employer getEmployerById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Employer e = (Employer) session.load(Employer.class, new Integer(id));
        return e;
    }

    @Override
    public void removeEmployer(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Employer emp = (Employer) session.load(Employer.class, new Integer(id));
        if(null != emp){
            session.delete(emp);
        }
    }
}
