package com.tellis.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tellis.cursomc.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // This interface is empty because JpaRepository provides all the necessary methods
    // for CRUD operations on the Person entity.
    // You can add custom query methods if needed.

}
