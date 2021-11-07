package de.htwberlin.webtech.PlanYourDay.service;


import de.htwberlin.webtech.PlanYourDay.persistance.PersonEntity;
import de.htwberlin.webtech.PlanYourDay.persistance.PersonRepository;
import de.htwberlin.webtech.PlanYourDay.web.api.Person;
import de.htwberlin.webtech.PlanYourDay.web.api.PersonCreateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll(){
        List <PersonEntity> persons = personRepository.findAll();
        return persons.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }

    public Person findById(Long id){
        var personEntity = personRepository.findById(id);
        return personEntity.isPresent()? transformEntity(personEntity.get()) : null;
    }

    public Person create (PersonCreateRequest request){
        var personEntity = new PersonEntity(request.getFirstName(), request.getLastName());
        personEntity = personRepository.save(personEntity);
        return transformEntity(personEntity);

    }

    private Person transformEntity(PersonEntity personEntity){
        return new Person(
                    personEntity.getId(),
                    personEntity.getFirstName(),
                    personEntity.getFirstName()
        );
    }
}