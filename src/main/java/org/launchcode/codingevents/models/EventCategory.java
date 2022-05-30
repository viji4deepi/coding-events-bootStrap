package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EventCategory {
    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message = "Event should be atleast 3 characters")
    @Size(min = 3)
    private String name;

    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory(){
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
