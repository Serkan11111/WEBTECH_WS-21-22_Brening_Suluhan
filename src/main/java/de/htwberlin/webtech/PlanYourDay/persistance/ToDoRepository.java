package de.htwberlin.webtech.PlanYourDay.persistance;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, Long> {

    List<ToDoEntity> findAllByToDo(String toDo);
    List<ToDoEntity> findAllByDescription(String description);
    List<ToDoEntity> findAllByToDoAndDescription(String toDo, String description);
    List<ToDoEntity> findAllByDone(Boolean done);

}
