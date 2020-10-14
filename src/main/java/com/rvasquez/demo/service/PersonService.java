package com.rvasquez.demo.service;

import com.rvasquez.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonService {

    int addPerson(Person person);

    List<Person> getAllPeople();

    Optional<Person> getPersonById(UUID id);

    public int deletePerson(UUID id);

    public int updatePersonById(UUID id, Person person);
}
