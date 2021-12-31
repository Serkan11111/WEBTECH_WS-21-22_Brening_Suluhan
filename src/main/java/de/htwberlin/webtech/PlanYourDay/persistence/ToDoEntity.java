package de.htwberlin.webtech.PlanYourDay.persistence;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "toDos")
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titel", nullable = false)
    private String titel;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "module", nullable = false)
    private String module;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "is_done")
    private Boolean done;

    @Column(name = "is_Favorite")
    private Boolean isFavorite;

    public ToDoEntity(String titel, String description, String module, LocalDate date, Boolean done, Boolean isFavorite) {

        this.titel = titel;
        this.description = description;
        this.module = module;
        this.date = date;
        this.done = done;
        this.isFavorite = isFavorite;
    }

    protected ToDoEntity() {    }

    public Long getId() {
        return id;
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

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Boolean getDone() {
        return done;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }
}