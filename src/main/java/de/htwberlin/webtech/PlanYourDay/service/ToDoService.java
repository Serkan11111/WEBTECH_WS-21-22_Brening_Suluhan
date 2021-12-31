package de.htwberlin.webtech.PlanYourDay.service;


import de.htwberlin.webtech.PlanYourDay.persistence.ToDoEntity;
import de.htwberlin.webtech.PlanYourDay.persistence.ToDoRepository;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDo;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDoManipulationRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;
    private final ToDoTransformer toDoTransformer;

    public ToDoService(ToDoRepository toDoRepository, ToDoTransformer toDoTransformer) {
        this.toDoRepository = toDoRepository;
        this.toDoTransformer = toDoTransformer;
    }

    public List<ToDo> findAll(){
        List<ToDoEntity> toDos = toDoRepository.findAll();
        return toDos.stream()
                .map(toDoTransformer::transformEntity)
                .collect(Collectors.toList());
    }

    public List<ToDo> findByModule(String module){
        List<ToDoEntity> toDos = toDoRepository.findAllByModule(module);
        return toDos.stream()
                .map(toDoTransformer::transformEntity)
                .collect(Collectors.toList());
    }

    public List<ToDo> findByDate(LocalDate date){
        List<ToDoEntity> toDos = toDoRepository.findAllByDate(date);
        return toDos.stream()
                .map(toDoTransformer::transformEntity)
                .collect(Collectors.toList());
    }

    public ToDo findById(Long id){
        var toDoEntity = toDoRepository.findById(id);
        return toDoEntity.map(toDoTransformer::transformEntity).orElse(null);
    }

    public ToDo create(ToDoManipulationRequest request) {
        var toDoEntity = new ToDoEntity(request.getTitel(), request.getDescription(), request.getModule(), request.getDate(), request.getDone(), request.getFavorite());
        toDoEntity = toDoRepository.save(toDoEntity);
        return toDoTransformer.transformEntity(toDoEntity);
    }

    public ToDo update(Long id, ToDoManipulationRequest request){
        var toDoEntityOptional = toDoRepository.findById(id);
        if (toDoEntityOptional.isEmpty()) {
            return null;
        }
                var toDoEntity = toDoEntityOptional.get();
                toDoEntity.setTitel(request.getTitel());
                toDoEntity.setDescription(request.getDescription());
                toDoEntity.setModule(request.getModule());
                toDoEntity.setDate(request.getDate());
                toDoEntity.setDone(request.getDone());
                toDoEntity.setFavorite(request.getFavorite());
                toDoEntity = toDoRepository.save(toDoEntity);
                return toDoTransformer.transformEntity(toDoEntity);
    }

    public boolean deleteById(Long id){
        if(!toDoRepository.existsById(id)){
            return false;
        }

        toDoRepository.deleteById(id);
        return true;
    }
}
