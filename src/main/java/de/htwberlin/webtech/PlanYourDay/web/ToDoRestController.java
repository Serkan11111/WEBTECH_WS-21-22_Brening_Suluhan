package de.htwberlin.webtech.PlanYourDay.web;

import de.htwberlin.webtech.PlanYourDay.service.ToDoService;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDo;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDoManipulationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@Validated
public class ToDoRestController {

private final ToDoService toDoService;

    public ToDoRestController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping(path = "/api/v1/todos")
    public ResponseEntity<List<ToDo>> fetchToDos() {
        return ResponseEntity.ok(toDoService.findAll());
    }

    @GetMapping(path = "/api/v1/todos/{id}")
    public ResponseEntity<ToDo> fetchToDoById(@PathVariable Long id) {
        var toDo = toDoService.findById(id);
        return toDo != null? ResponseEntity.ok(toDo) : ResponseEntity.notFound().build();
    }

    @PostMapping(path = "/api/v1/todos")
        public ResponseEntity<Void> createToDo(@Valid @RequestBody ToDoManipulationRequest request) throws URISyntaxException {
            var toDo = toDoService.create(request);
            String uri = String.valueOf(toDo.getId());
            return ResponseEntity.created(URI.create(uri)).header("Access-Control-Expose-Headers","Location").build();
        }

        @PutMapping(path = "/api/v1/todos/{id}")
        public ResponseEntity<ToDo> updateToDo(@PathVariable Long id, @RequestBody ToDoManipulationRequest request) {
               var toDo = toDoService.update(id, request);
               return toDo != null? ResponseEntity.ok(toDo) : ResponseEntity.notFound().build();
        }

        @DeleteMapping(path = "/api/v1/todos/{id}")
        public ResponseEntity<Void> deleteToDo(@PathVariable Long id){
        boolean successful = toDoService.deleteById(id);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
        }
}


