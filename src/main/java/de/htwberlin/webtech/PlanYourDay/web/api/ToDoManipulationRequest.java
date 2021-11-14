package de.htwberlin.webtech.PlanYourDay.web.api;

public class ToDoManipulationRequest {

    private String toDo;
    private String description;

    public ToDoManipulationRequest(String toDo, String description) {
        this.toDo = toDo;
        this.description = description;
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
