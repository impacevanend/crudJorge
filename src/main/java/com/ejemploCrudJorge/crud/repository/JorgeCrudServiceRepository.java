package com.ejemploCrudJorge.crud.repository;
import com.ejemploCrudJorge.crud.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JorgeCrudServiceRepository extends CrudRepository<Person, Integer>{
    public Person findByFirstName(String firstName);
}
