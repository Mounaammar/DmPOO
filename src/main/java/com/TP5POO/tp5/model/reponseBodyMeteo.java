package com.TP5POO.tp5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class reponseBodyMeteo {
    int id;
    Coord coord;
    String name;
    String message;
    String cod;
    String base;
    @JsonProperty("main")
    MainResponse mainResponse;
    List<Weather> weather=new ArrayList<>();
    int visiblity;
    @JsonProperty("wind")
    Wind wind;
    int dt;
    sys sysMeteo;
    @JsonProperty("cloud")
    Clouds clouds;
    int timezone;
    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }




    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainResponse getMainResponse() {
        return mainResponse;
    }

    public void setMainResponse(MainResponse mainResponse) {
        this.mainResponse = mainResponse;
    }

    public int getVisiblity() {
        return visiblity;
    }

    public void setVisiblity(int visiblity) {
        this.visiblity = visiblity;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }



    public sys getSysMeteo() {
        return sysMeteo;
    }

    public void setSysMeteo(sys sysMeteo) {
        this.sysMeteo = sysMeteo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "id: "+id+", name: "+name+"weather"+weather+", message: "+message+", code: "+cod;
    }
}

