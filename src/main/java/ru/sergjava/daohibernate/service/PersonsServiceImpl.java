package ru.sergjava.daohibernate.service;

import org.springframework.stereotype.Service;
import ru.sergjava.daohibernate.model.Person;
import ru.sergjava.daohibernate.repository.PersonRepository;

import java.io.IOException;
import java.util.List;

@Service
public class PersonsServiceImpl implements PersonsService {
    private final PersonRepository repository;

    public PersonsServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> getPersonsByCity(String city) throws IOException {
        return repository.getPersonsByCity(city);
    }
}
