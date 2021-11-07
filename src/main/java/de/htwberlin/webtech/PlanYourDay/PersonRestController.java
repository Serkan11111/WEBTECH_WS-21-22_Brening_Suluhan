package de.htwberlin.webtech.PlanYourDay;

import de.htwberlin.webtech.PlanYourDay.persistance.PersonRepository;
import de.htwberlin.webtech.PlanYourDay.web.api.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonRestController {


private final PersonRepository personRepository;

    public PersonRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @GetMapping(path = "/api/v1/persons")
    public ResponseEntity<List<Person>> fetchPersons() {
        var persons = personRepository.findAll();
        return ResponseEntity.ok(persons);
    }

}
