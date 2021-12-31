package de.htwberlin.webtech.PlanYourDay.web.api;

import java.time.LocalDate;

public class ToDo {

    private long id;
    private String titel;
    private String description;
    private String module;
    private LocalDate date;
    private Boolean done;
    private Boolean isFavorite;

    public ToDo(long id, String titel, String description, String module, LocalDate date, Boolean done, Boolean isFavorite) {
        this.id = id;
        this.titel = titel;
        this.description = description;
        this.module = module;
        this.date = date;
        this.done = done;
        this.isFavorite = isFavorite;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

    public Boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }
}
