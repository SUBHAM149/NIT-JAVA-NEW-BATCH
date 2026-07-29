package com.sub.nit.service;

import java.util.List;

import com.sub.nit.entity.Person;

public interface PersonService {

  public  Person savePerson(Person person);

    List<Person> getAllPersons();

}
