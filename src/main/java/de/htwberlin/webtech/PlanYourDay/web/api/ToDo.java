package de.htwberlin.webtech.PlanYourDay.web.api;

public class ToDo {

    private long id;
    private String titel;
    private String description;
    private String module;
    private String date;
    private Boolean done;
    private boolean isFavorite;

    public ToDo(long id, String titel, String description, String module, String date, Boolean done, boolean isFavorite) {
        this.id = id;
        this.titel = titel;
        this.description = description;
        this.module = module;
        this.date = date;
        this.done = done;
        this.isFavorite = isFavorite;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
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

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
