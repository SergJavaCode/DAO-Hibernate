package ru.sergjava.daohibernate.repository;

import ru.sergjava.daohibernate.model.Person;

import java.util.List;

public interface PersonRepository {
    public List<Person> getPersonsByCity(String city);
}
