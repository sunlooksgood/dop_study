package com.example.accessingdatarest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingdatarest.model.Person;
import com.example.accessingdatarest.service.DataService;

@RestController
@RequestMapping("/api/v1/data")
public class DataController {
    
    @Autowired
    DataService dataService;

    @GetMapping("/people")
    public List<Person> getListOfPerson() {
        return dataService.getPeople();
    }
}
