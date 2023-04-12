package com.devops.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.devops.Entity.Personal;
import com.devops.Repo.PersonRepo;

@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepo perReposit;

    public Personal addPerson(Personal person) {
        perReposit.persist(person);
        
        return person;
    }
    
}
