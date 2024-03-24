package ru.sergjava.daohibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergjava.daohibernate.model.Person;
import ru.sergjava.daohibernate.model.PersonID;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepositoryJPA extends JpaRepository<Person, PersonID> {
    List<Person> findByCityOfLiving(String cityOfLiving);

    List<Person> findByPersonIDAgeLessThan(Integer age);

    List<Optional<Person>> findByPersonIDNameAndPersonIDSurname(String name, String surname);
}
