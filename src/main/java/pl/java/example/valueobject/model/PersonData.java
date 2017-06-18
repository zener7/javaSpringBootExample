package pl.java.example.valueobject.model;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Tolerate;

@Embeddable
@Getter
@Builder
@EqualsAndHashCode
public final class PersonData {

    private String name;
    private Integer age;

    @Tolerate
    private PersonData() {
    }

    
}
