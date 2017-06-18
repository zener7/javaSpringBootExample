package pl.java.example.valueobject.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(value = AccessLevel.PRIVATE)
@Setter(value = AccessLevel.PRIVATE)
@MappedSuperclass
public abstract class IdValueObject {

    @Id
    @GeneratedValue
    private Long id;
}
