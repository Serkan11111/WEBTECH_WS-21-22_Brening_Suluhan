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

    @Column(name = "lastName", nullable = false)
    private String lastName;


    public PersonEntity(String toDoTitle, String lastName) {

        this.toDoTitle = toDoTitle;
        this.lastName = lastName;
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

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
}