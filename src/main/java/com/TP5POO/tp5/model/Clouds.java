package com.TP5POO.tp5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {
    private int cl;

    public int getCl() {
        return cl;
    }

    public void setCl(int cl) {
        this.cl = cl;
    }

    @Override
    public String toString() {
        return "all: "+cl;
    }
}
