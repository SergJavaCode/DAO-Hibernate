package ru.sergjava.daohibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sergjava.daohibernate.model.Person;
import ru.sergjava.daohibernate.model.PersonID;
import ru.sergjava.daohibernate.service.PersonsServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class GetPersons {
    private PersonsServiceImpl personsService;

    public GetPersons(PersonsServiceImpl personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/persons/save")
    public Person savePerson(@RequestBody Person person) {
        return personsService.savePerson(person);
    }

    @GetMapping("/persons/find-by-id")
    public Optional<Person> findPersonById(@RequestBody PersonID personID) {
        return personsService.findPersonById(personID);
    }

    @GetMapping("/persons/delete-by-id")
    public void deletePersonByID(@RequestBody PersonID personID) {
        personsService.deletePersonByID(personID);
    }

    @GetMapping("/persons/find-by-city")
    public List<Person> findByCityOfLiving(@RequestParam String city) {
        return personsService.findPersonByCity(city);
    }

    @GetMapping("/persons/find-by-age-less-than")
    public List<Person> findByCityOfLiving(@RequestParam Integer age) {
        return personsService.findByPersonIDAgeLessThan(age);
    }

    @GetMapping("/persons/find-by-name-surname")
    public List<Optional<Person>> findByPersonIDNameAndPersonIDSurname(@RequestParam String name, String surname) {
        return personsService.findByPersonIDNameAndPersonIDSurname(name, surname);
    }


}
