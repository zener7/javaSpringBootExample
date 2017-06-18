package pl.java.example.valueobject.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class PersonEntity implements Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private PersonData personData;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "addressDatas")
    private Set<AddressData> addressDatas = new HashSet<>(0);
    
}
