package de.htwberlin.webtech.PlanYourDay.web.api;

public class Person {

    private long id;
    private String toDoTitle;
    private String toDoDescription;


    public Person(long id, String toDoTitle, String toDoDescription) {
        this.id = id;
        this.toDoTitle = toDoTitle;
        this.toDoDescription = toDoDescription;
    }




    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getToDoTitle() {

        return toDoTitle;
    }

    public void setToDoTitle(String toDoTitle) {

        this.toDoTitle = toDoTitle;
    }

    public String gettoDoDescription() {

        return toDoDescription;
    }

    public void settoDoDescription(String toDoDescription) {

        this.toDoDescription = toDoDescription;
    }
}
