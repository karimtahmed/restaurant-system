/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author karem
 */
public abstract class Restaurant {

    private String menue;
    private String location;
    private String name;

    //empty constructor 
    public Restaurant() {
        this.location = "";
        this.menue = "";
        this.name = "";
    }

//filled constructor 
    public Restaurant(String menue, String loction, String name) {
        this.location = location;
        this.menue = menue;
        this.name = name;
    }

    // order function
    //  abstract function 
    public abstract String Order();

//setters and getters 
    public String getMenue() {
        return menue;
    }

    public void setMenue(String menue) {
        this.menue = menue;
    }

    public String getLoction() {
        return location;
    }

    public void setLoction(String loction) {
        this.location = loction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

