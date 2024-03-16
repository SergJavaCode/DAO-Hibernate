package ru.sergjava.daohibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.sergjava.daohibernate.model.Person;

import java.util.List;


@Repository
public class PersonRepositoryImpl implements PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Person> getPersonsByCity(String city) {
        String query = String.format("select * from person where city_of_living = '%s'", city);
        var persons = entityManager.createNativeQuery(query, Person.class);
        return persons.getResultList();
    }
}
