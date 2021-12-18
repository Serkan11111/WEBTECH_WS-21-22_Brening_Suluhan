package de.htwberlin.webtech.PlanYourDay.web.api;

public class ToDoManipulationRequest {

    private String toDo;
    private String description;
    private String module;
    private boolean done;
    private int prio;

    public ToDoManipulationRequest(String toDo, String description, boolean done, String module, int prio) {
        this.toDo = toDo;
        this.description = description;
        this.done = done;
        this.module = module;
        this.prio = prio;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
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
