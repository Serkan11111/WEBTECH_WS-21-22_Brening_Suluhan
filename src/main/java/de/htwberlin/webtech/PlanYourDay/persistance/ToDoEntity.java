package de.htwberlin.webtech.PlanYourDay.persistance;

import javax.persistence.*;

@Entity(name = "todos")
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "toDo", nullable = false)
    private String toDo;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "is_done")
    private Boolean done;

    public ToDoEntity(String toDo, String description, Boolean done) {

        this.toDo = toDo;
        this.description = description;
        this.done = done;
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


    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}