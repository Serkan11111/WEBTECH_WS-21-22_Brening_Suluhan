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

    @Column(name = "module", nullable = false)
    private String module;


    public ToDoEntity(String toDo, String description, Boolean done, String module) {

        this.toDo = toDo;
        this.description = description;
        this.done = done;
        this.module = module;
    }

    protected ToDoEntity() {

    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
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