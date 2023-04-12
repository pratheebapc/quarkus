package com.devops.Repo;

import javax.enterprise.context.ApplicationScoped;

import com.devops.Entity.Personal;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class PersonRepo implements PanacheMongoRepository<Personal>{
    
}
