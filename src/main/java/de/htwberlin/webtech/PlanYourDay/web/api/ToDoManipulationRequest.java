package de.htwberlin.webtech.PlanYourDay.web.api;

public class ToDoManipulationRequest {

    private String toDo;
    private String description;
    private boolean done;

    public ToDoManipulationRequest(String toDo, String description, boolean done) {
        this.toDo = toDo;
        this.description = description;
        this.done = done;
    }

    public ToDoManipulationRequest(){

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

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
