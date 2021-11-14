package de.htwberlin.webtech.PlanYourDay;

import de.htwberlin.webtech.PlanYourDay.service.ToDoService;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDo;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDoManipulationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Controller nimmt Request entgegen und delegiert an Service

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
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
    public ResponseEntity<ToDo> fetchToDoById(@PathVariable(name = "id") Long id){
        var todo = toDoService.findById(id);
        return todo != null? ResponseEntity.ok(todo): ResponseEntity.notFound().build();
    }


        @PostMapping(path = "/api/v1/todos")
            public ResponseEntity<Void> createToDo(@RequestBody ToDoManipulationRequest request) throws URISyntaxException {
                var todo = toDoService.create(request);
                URI uri = new URI("/api/v1/todos/" + todo.getId());
                return ResponseEntity.created(uri).build();
        }

        @PutMapping(path = "/api/v1/todos/{id}")
        public ResponseEntity<ToDo> updateToDo(@PathVariable(name = "id") Long id, @RequestBody ToDoManipulationRequest request) {
               var toDo = toDoService.update(id, request);
               return toDo != null? ResponseEntity.ok(toDo): ResponseEntity.notFound().build();
        }

        @DeleteMapping(path = "/api/v1/todos/{id}")
        public ResponseEntity<Void> deleteToDo(@PathVariable Long id){
        boolean successful = toDoService.deleteById(id);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
        }
}


