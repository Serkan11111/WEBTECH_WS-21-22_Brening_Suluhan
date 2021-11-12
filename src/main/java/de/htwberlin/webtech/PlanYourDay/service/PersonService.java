package de.htwberlin.webtech.PlanYourDay.service;


import de.htwberlin.webtech.PlanYourDay.persistance.PersonEntity;
import de.htwberlin.webtech.PlanYourDay.persistance.PersonRepository;
import de.htwberlin.webtech.PlanYourDay.web.api.Person;
import de.htwberlin.webtech.PlanYourDay.web.api.PersonManipulationRequest;
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

    public Person create (PersonManipulationRequest request){
        var personEntity = new PersonEntity(request.getToDoTitle(), request.getToDoDescription());
        personEntity = personRepository.save(personEntity);
        return transformEntity(personEntity);

    }

    public Person update(Long id, PersonManipulationRequest request){
        var personEntityOptional = personRepository.findById(id);
        if (personEntityOptional.isEmpty()) {
            return null;
        }
                var personEntity = personEntityOptional.get();
                personEntity.setToDoTitle(request.getToDoTitle());
                personEntity.setToDoDescription(request.getToDoDescription());

                personEntity = personRepository.save(personEntity);

                return transformEntity(personEntity);

    }

    public boolean deleteById(Long id){
        if(!personRepository.existsById(id)){
            return false;
        }

        personRepository.deleteById(id);
        return true;
    }


    private Person transformEntity(PersonEntity personEntity){
        return new Person(
                    personEntity.getId(),
                    personEntity.getToDoTitle(),
                    personEntity.getToDoDescription()
                //datum
                //prio
                //text
                //title
                //tag
                //modulfilter

        );
    }
}
