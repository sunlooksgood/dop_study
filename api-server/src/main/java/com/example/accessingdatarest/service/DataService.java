package com.example.accessingdatarest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatarest.model.Person;
import com.example.accessingdatarest.model.PersonRepository;

@Service
public class DataService {

    @Autowired
    PersonRepository repo;
    
    public List<Person> getPeople() {
        return repo.findAllByAddressIdIsNotNull();
    }

}
