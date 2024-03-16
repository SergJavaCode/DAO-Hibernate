package ru.sergjava.daohibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sergjava.daohibernate.model.Person;
import ru.sergjava.daohibernate.service.PersonsServiceImpl;

import java.io.IOException;
import java.util.List;

@RestController
public class GetPersons {
    private PersonsServiceImpl personsService;

    public GetPersons(PersonsServiceImpl personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) throws IOException {
        return personsService.getPersonsByCity(city);
    }
}
