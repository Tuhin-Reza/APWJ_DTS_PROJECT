package com.repository;

import com.domain.Registration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepositoryImp implements RegistrationRepository{

    private SessionFactory sessionFactory;

    public RegistrationRepositoryImp(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    public Registration create(Registration registration) {
        Session session = sessionFactory.getCurrentSession();
        session.save(registration);
        return registration;
    }

}
