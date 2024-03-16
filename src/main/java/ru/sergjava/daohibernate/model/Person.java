package ru.sergjava.daohibernate.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Person {

    @EmbeddedId
    private PersonID personID;
    private Long phone;
    private String cityOfLiving;


//    name	VARCHAR(30) NOT NULL,
//    surname VARCHAR(30) NOT NULL,
//    age		INTEGER		NOT NULL
//    check (age between 16 and 110), /*устанавливаем границы допустимых возрастов*/
//    phone   DOUBLE PRECISION UNIQUE
//    check (length(phone::text) BETWEEN 11 AND 15), /*устанавливаем допустимую длинну номера*/
//    city_of_living VARCHAR(20),
//    PRIMARY KEY (name, surname, age)

}

