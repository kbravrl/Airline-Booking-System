/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.airline;

public class Airport {
    private int airportID;
    private String airportNumber;
    private String city;
    private String country;

    public Airport(int airportID, String airportNumber, String city, String country) {
        this.airportID = airportID;
        this.airportNumber = airportNumber;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airport{" + "airportID=" + airportNumber + ", city=" + city + ", country=" + country + '}';
    }

    public int getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }
    
    public String getAirportNumber() {
        return airportNumber;
    }

    public void setAirportNumber(String airportNumber) {
        this.airportNumber = airportNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
