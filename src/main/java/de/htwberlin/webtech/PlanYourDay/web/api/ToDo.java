package de.htwberlin.webtech.PlanYourDay.web.api;

public class ToDo {

    private long id;
    private String titel;
    private String description;
    private String module;
    private String date;
    private boolean done;

    public ToDo(long id, String titel, String description, String module, String date, boolean done) {
        this.id = id;
        this.titel = titel;
        this.description = description;
        this.module = module;
        this.date = date;
        this.done = done;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getTitel() {

        return titel;
    }

    public void setTitel(String titel) {

        this.titel = titel;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
