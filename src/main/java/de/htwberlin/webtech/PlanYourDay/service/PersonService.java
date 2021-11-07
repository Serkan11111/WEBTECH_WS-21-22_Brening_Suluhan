package de.htwberlin.webtech.PlanYourDay.service;


import de.htwberlin.webtech.PlanYourDay.persistance.PersonEntity;
import de.htwberlin.webtech.PlanYourDay.persistance.PersonRepository;
import de.htwberlin.webtech.PlanYourDay.web.api.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    rivate final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll(){
        List <PersonEntity> persons = personRepository.findAll();
        return persons.stream()
                .map(personEntity -> new Person(
                        personEntity.getId(),
                        personEntity.getFirstName(),
                        personEntity.getFirstName()

                ))
                .collect(Collectors.toList());
    }
}
