package ru.sergjava.daohibernate.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.sergjava.daohibernate.model.Person;
import ru.sergjava.daohibernate.model.PersonID;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepositoryJPA extends JpaRepository<Person, PersonID> {
    @Query(value = "select p from Person p where p.cityOfLiving=:city")
    List<Person> findByCityOfLiving(@Param("city") String cityOfLiving);

    @Query(value = "select p from Person p where p.personID.age<:age")
    List<Person> findByPersonIDAgeLessThan(@Param("age") Integer age, Sort sort);

    @Query(value = "select p from Person p where p.personID.name=:name and p.personID.surname=:surname")
    List<Optional<Person>> findByPersonIDNameAndPersonIDSurname(@Param("name") String name, @Param("surname") String surname);
}
