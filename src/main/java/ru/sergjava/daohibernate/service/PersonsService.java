package ru.sergjava.daohibernate.service;

import ru.sergjava.daohibernate.model.Person;
import ru.sergjava.daohibernate.model.PersonID;

import java.util.List;
import java.util.Optional;

public interface PersonsService {
    public Person savePerson(Person person);

    public Optional<Person> findPersonById(PersonID personID);

    public void deletePersonByID(PersonID personID);

    public List<Person> findPersonByCity(String city);

    public List<Person> findByPersonIDAgeLessThan(Integer age);

    public List<Optional<Person>> findByPersonIDNameAndPersonIDSurname(String name, String surname);
}
