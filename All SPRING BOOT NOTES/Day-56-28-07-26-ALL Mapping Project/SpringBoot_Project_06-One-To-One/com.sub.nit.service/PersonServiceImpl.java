package com.sub.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Person;
import com.sub.nit.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repo;

    @Override
    public Person savePerson(Person person) {
        return repo.save(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return repo.findAll();
    }
}
