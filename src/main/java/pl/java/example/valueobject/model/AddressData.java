package pl.java.example.valueobject.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Tolerate;


@Builder
@EqualsAndHashCode(callSuper = false)
@Getter
@Entity
public class AddressData extends IdValueObject {

    private String city;
    private Integer streetNumber;
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "post_office", joinColumns = @JoinColumn(name = "id"))
    private Set<PostOffice> offices;

    @Tolerate
    private AddressData() {
    }

}
