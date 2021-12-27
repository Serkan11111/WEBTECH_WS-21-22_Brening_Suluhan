package de.htwberlin.webtech.PlanYourDay.service;

import de.htwberlin.webtech.PlanYourDay.persistence.ToDoEntity;
import de.htwberlin.webtech.PlanYourDay.web.api.ToDo;
import org.springframework.stereotype.Service;

@Service
public class ToDoTransformer {

    public ToDo transformEntity(ToDoEntity toDoEntity) {
                return new ToDo(
                toDoEntity.getId(),
                toDoEntity.getTitel(),
                toDoEntity.getDescription(),
                toDoEntity.getModule(),
                toDoEntity.getDate(),
                toDoEntity.getDone());
    }
}
