package de.htwberlin.webtech.PlanYourDay.web.api;

public class ToDoManipulationRequest {

    private String toDo;
    private String description;
    private String module;
    private boolean done;

    public ToDoManipulationRequest(String toDo, String description, boolean done, String module) {
        this.toDo = toDo;
        this.description = description;
        this.done = done;
        this.module = module;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
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
