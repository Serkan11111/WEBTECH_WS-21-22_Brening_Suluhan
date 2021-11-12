package de.htwberlin.webtech.PlanYourDay.web.api;

public class Person {

    private long id;
    private String toDoTitle;
    private String lastName;


    public Person(long id, String toDoTitle, String lastName) {
        this.id = id;
        this.toDoTitle = toDoTitle;
        this.lastName = lastName;
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

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
}
