package ru.sergjava.daohibernate.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;


@Embeddable
@Data
public class PersonID implements Serializable {
    private String name;
    private String surname;
    private Integer age;

}
