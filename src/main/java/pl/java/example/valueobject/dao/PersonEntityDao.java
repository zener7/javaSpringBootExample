package pl.java.example.valueobject.dao;

import org.springframework.stereotype.Repository;

import pl.java.example.base.MRRepository;
import pl.java.example.valueobject.model.PersonEntity;

@Repository
public interface PersonEntityDao extends MRRepository<PersonEntity>{

}
