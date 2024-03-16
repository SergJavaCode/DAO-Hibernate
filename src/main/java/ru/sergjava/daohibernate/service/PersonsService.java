package ru.sergjava.daohibernate.service;

import ru.sergjava.daohibernate.model.Person;

import java.io.IOException;
import java.util.List;

public interface PersonsService {
    public List<Person> getPersonsByCity(String city) throws IOException;

}
