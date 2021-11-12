package de.htwberlin.webtech.PlanYourDay.persistance;


import de.htwberlin.webtech.PlanYourDay.web.api.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    List<PersonEntity> findAllByToDoTitle(String toDoTitle);
    List<PersonEntity> findAllByToDoDescription(String toDoDescription);
    List<PersonEntity> findAllByToDoTitleAndToDoDescription(String toDoTitle, String toDoDescription);

}
