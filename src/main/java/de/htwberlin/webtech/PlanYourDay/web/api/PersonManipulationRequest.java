package de.htwberlin.webtech.PlanYourDay.web.api;

public class PersonManipulationRequest {

    private String toDoTitle;
    private String toDoDescription;

    public PersonManipulationRequest(String toDoTitle, String toDoDescription) {
        this.toDoTitle = toDoTitle;
        this.toDoDescription = toDoDescription;
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
