package de.htwberlin.webtech.PlanYourDay.persistance;

import javax.persistence.*;

@Entity(name= "persons")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "toDoTitle", nullable = false)
    private String toDoTitle;

    @Column(name = "toDoDescription", nullable = false)
    private String toDoDescription;


    public PersonEntity(String toDoTitle, String toDoDescription) {

        this.toDoTitle = toDoTitle;
        this.toDoDescription = toDoDescription;
    }

    protected PersonEntity() {

    }

    public Long getId() {

        return id;
    }

    public String getToDoTitle() {

        return toDoTitle;
    }

    public void setToDoTitle(String toDoTitle) {

        this.toDoTitle = toDoTitle;
    }

    public String getToDoDescription() {

        return toDoDescription;
    }

    public void setToDoDescription(String toDoDescription) {

        this.toDoDescription = toDoDescription;
    }
}