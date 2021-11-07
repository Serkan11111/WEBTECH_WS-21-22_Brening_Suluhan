package de.htwberlin.webtech.PlanYourDay.persistance;


import de.htwberlin.webtech.PlanYourDay.web.api.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    List<PersonEntity> findAllByFirstName(String firstName);
    List<PersonEntity> findAllByLastName(String lastName);
    List<PersonEntity> findAllByFirstNameAndLastName(String firstName, String lastName);

}
