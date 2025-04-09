package com.tellis.cursomc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.tellis.cursomc.model.Person;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {

        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Tellis");
        person.setLastName("Lima");
        person.setAddress("Rua Boa Vista, Santa Catarina - Brasil");
        person.setGender("Male");
        return person;

    }

}