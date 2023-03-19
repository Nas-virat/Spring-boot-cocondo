package com.example.CondoSpringBoot.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Condo {

    @Id
    private final UUID id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    private String road;
    private String subdisstrict;
    private String disstrict;
    private String city;

    private String codenumber;

    private int rating;

    public Condo(UUID id, String name, String road, String subdisstrict, String disstrict, String city, String codenumber, int rate) {
        this.id = id;
        this.name = name;
        this.road = road;
        this.subdisstrict = subdisstrict;
        this.disstrict = disstrict;
        this.city = city;
        this.codenumber = codenumber;
        rating = rate;
    }


    public String getSubdisstrict() {
        return subdisstrict;
    }

    public void setSubdisstrict(String subdisstrict) {
        this.subdisstrict = subdisstrict;
    }

    public String getDisstrict() {
        return disstrict;
    }

    public void setDisstrict(String disstrict) {
        this.disstrict = disstrict;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCodenumber() {
        return codenumber;
    }

    public void setCodenumber(String codenumber) {
        this.codenumber = codenumber;
    }

    public int getRate() {
        return rating;
    }

    public void setRate(int rate) {
        rating = rate;
    }
}
