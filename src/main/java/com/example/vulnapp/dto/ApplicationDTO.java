package com.example.vulnapp.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class ApplicationDTO {
    private String name;

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
    private Object owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getOwner() {
        return owner;
    }

    public void setOwner(Object owner) {
        this.owner = owner;
    }
}
