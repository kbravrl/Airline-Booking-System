/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.airline;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

class Flight {
    
    private int flightID;
    private String flightNumber;
    private LocalDate departureDate;
    private int departureAirport;
    private int destinationAirport;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private Map<Seat, Boolean> seatStatus;
    

    public Flight(int flightID, String flightNumber, LocalDate departureDate, int departureAirport,
             int destinationAirport, LocalTime departureTime, LocalTime arrivalTime) {
        this.flightID = flightID;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatStatus = new HashMap<>();
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public int getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(int departureAirport) {
        this.departureAirport = departureAirport;
    }

    public int getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(int destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Map<Seat, Boolean> getSeatStatus() {
        return seatStatus;
    }   
}
