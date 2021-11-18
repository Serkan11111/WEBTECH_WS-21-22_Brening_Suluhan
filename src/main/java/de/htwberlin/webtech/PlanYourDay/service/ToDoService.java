package de.htwberlin.webtech.PlanYourDay.service;


import de.htwberlin.webtech.PlanYourDay.persistance.ToDoEntity;
import de.htwberlin.webtech.PlanYourDay.persistance.ToDoRepository;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDo;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDoManipulationRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll(){
        List <ToDoEntity> todos = toDoRepository.findAll();
        return todos.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }

    public ToDo findById(Long id){
        var toDoEntity = toDoRepository.findById(id);
        return toDoEntity.isPresent()? transformEntity(toDoEntity.get()) : null;
    }

    public ToDo create (ToDoManipulationRequest request){
        var toDoEntity = new ToDoEntity(request.getToDo(), request.getDescription(), request.isDone());
        toDoEntity = toDoRepository.save(toDoEntity);
        return transformEntity(toDoEntity);

    }

    public ToDo update(Long id, ToDoManipulationRequest request){
        var toDoEntityOptional = toDoRepository.findById(id);
        if (toDoEntityOptional.isEmpty()) {
            return null;
        }
                var toDoEntity = toDoEntityOptional.get();
                toDoEntity.setToDo(request.getToDo());
                toDoEntity.setDescription(request.getDescription());
                toDoEntity.setDone(request.isDone());
                toDoEntity = toDoRepository.save(toDoEntity);

                return transformEntity(toDoEntity);


    }

    public boolean deleteById(Long id){
        if(!toDoRepository.existsById(id)){
            return false;
        }

        toDoRepository.deleteById(id);
        return true;
    }


    private ToDo transformEntity(ToDoEntity toDoEntity){
        return new ToDo(
                toDoEntity.getId(),
                toDoEntity.getToDo(),
                toDoEntity.getDescription(),
                toDoEntity.getDone()
        );
    }
}
