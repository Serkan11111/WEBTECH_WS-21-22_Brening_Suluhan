package de.htwberlin.webtech.PlanYourDay;

import de.htwberlin.webtech.PlanYourDay.service.PersonService;
import de.htwberlin.webtech.PlanYourDay.web.api.Person;
import de.htwberlin.webtech.PlanYourDay.web.api.PersonCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Controller nimmt Request entgegen und delegiert an Service

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class PersonRestController {


private final PersonService personService;

    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping(path = "/api/v1/persons")
    public ResponseEntity<List<Person>> fetchPersons() {
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping(path = "/api/v1/persons/{id}")
    public ResponseEntity<Person> fetchPersonById(@PathVariable(name = "id") Long id){
        var person = personService.findById(id);
        return ResponseEntity.ok(person);
    }




@PostMapping(path = "/api/v1/persons")
    public ResponseEntity<Void> createPerson(@RequestBody PersonCreateRequest request) throws URISyntaxException {
      var person = personService.create(request);
    URI uri = new URI("/api/v1/persons/" + person.getId());
      return ResponseEntity.created(uri).build();

}


}
