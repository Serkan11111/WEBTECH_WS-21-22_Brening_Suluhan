package de.htwberlin.webtech.PlanYourDay.persistance;

import javax.persistence.*;

@Entity(name= "todos")
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "toDo", nullable = false)
    private String toDo;

    @Column(name = "description", nullable = false)
    private String description;


    public ToDoEntity(String toDo, String description) {

        this.toDo = toDo;
        this.description = description;
    }

    protected ToDoEntity() {

    }

    public Long getId() {

        return id;
    }

    public String getToDo() {

        return toDo;
    }

    public void setToDo(String toDo) {

        this.toDo = toDo;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}