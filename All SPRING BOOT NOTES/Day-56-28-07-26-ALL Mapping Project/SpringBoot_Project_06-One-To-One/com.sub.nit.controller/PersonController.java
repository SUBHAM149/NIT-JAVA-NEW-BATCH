package com.sub.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.entity.Person;
import com.sub.nit.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return service.savePerson(person);
    }

    @GetMapping("/all")
    public List<Person> getAll() {
        return service.getAllPersons();
    }
}
