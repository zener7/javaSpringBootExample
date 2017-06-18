package pl.java.example.valueobject.model;

import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

@Builder
@Embeddable
@EqualsAndHashCode
@Getter
@Setter(value=AccessLevel.PRIVATE)
public class PostOffice {

    private String city1;
    private String code;
    
    @Tolerate
    private PostOffice() {
    }
    
    
}
