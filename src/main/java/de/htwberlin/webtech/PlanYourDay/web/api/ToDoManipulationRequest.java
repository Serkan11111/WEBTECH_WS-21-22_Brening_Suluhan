package de.htwberlin.webtech.PlanYourDay.web.api;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class ToDoManipulationRequest {
    @Size(min = 3, message = "Bitte gib eine To Do mit mindestens 3 Zeichen ein.")
    private String titel;
    @NotBlank(message = "Bitte gib eine nähere Beschreibung zu deiner To Do ein.")
    private String description;
    @NotBlank(message = "Bitte gib das Modul deiner To Do ein.")
    private String module;
    @FutureOrPresent(message = "Bitte wähle das heutige Datum oder ein Datum in der Zukunft aus.")
    private LocalDate date;
    private Boolean done;
    private Boolean isFavorite;

    public ToDoManipulationRequest() {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }
}
