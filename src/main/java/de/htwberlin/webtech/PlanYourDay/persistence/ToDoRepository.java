package de.htwberlin.webtech.PlanYourDay.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, Long> {

    List<ToDoEntity> findAllByModule(String module);
    List<ToDoEntity> findAllByDate(LocalDate date);
}
