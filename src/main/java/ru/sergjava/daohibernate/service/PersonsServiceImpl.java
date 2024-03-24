package ru.sergjava.daohibernate.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.sergjava.daohibernate.model.Person;
import ru.sergjava.daohibernate.model.PersonID;
import ru.sergjava.daohibernate.repository.PersonRepositoryJPA;

import java.util.List;
import java.util.Optional;

@Service
public class PersonsServiceImpl implements PersonsService {

    private final PersonRepositoryJPA repositoryJPA;

    public PersonsServiceImpl(PersonRepositoryJPA repositoryJPA) {

        this.repositoryJPA = repositoryJPA;
    }


    @Override
    public Person savePerson(Person person) {
        return repositoryJPA.save(person);
    }

    @Override
    public Optional<Person> findPersonById(PersonID personID) {
        return repositoryJPA.findById(personID);
    }

    @Override
    public void deletePersonByID(PersonID personID) {
        repositoryJPA.deleteById(personID);
    }

    @Override
    public List<Person> findPersonByCity(String city) {

        return repositoryJPA.findByCityOfLiving(city);
    }

    @Override
    public List<Person> findByPersonIDAgeLessThan(Integer age) {
        return repositoryJPA.findByPersonIDAgeLessThan(age, Sort.by(
                new Sort.Order(Sort.Direction.ASC,"personID.age")
        ));
    }

    @Override
    public List<Optional<Person>> findByPersonIDNameAndPersonIDSurname(String name, String surname) {
        return repositoryJPA.findByPersonIDNameAndPersonIDSurname(name, surname);
    }

}
