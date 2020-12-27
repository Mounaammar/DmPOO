package com.TP5POO.tp5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
private int id;
private String description;

private String mainMeteo;
private String icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainMeteo() {
        return mainMeteo;
    }

    public void setMainMeteo(String mainMeteo) {
        this.mainMeteo = mainMeteo;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "id: "+id+", description: "+description+", main:"+mainMeteo+", icon: "+icon;
    }
}
