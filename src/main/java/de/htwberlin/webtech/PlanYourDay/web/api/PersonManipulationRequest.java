package de.htwberlin.webtech.PlanYourDay.web.api;

public class PersonManipulationRequest {

    private String toDoTitle;
    private String lastName;

    public PersonManipulationRequest(String toDoTitle, String lastName) {
        this.toDoTitle = toDoTitle;
        this.lastName = lastName;
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
