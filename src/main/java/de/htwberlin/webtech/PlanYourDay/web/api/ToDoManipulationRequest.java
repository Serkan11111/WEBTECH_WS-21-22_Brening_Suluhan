package de.htwberlin.webtech.PlanYourDay.web.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ToDoManipulationRequest {
    @Size(min = 3, message = "Please provide a To Do with 3 characters or more.")
    private String titel;
    @NotBlank(message = "The description must not be empty.")
    private String description;
    @NotBlank(message = "The module must not be empty.")
    private String module;
    private String date;
    private Boolean done;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
