/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.airline;

class Seat {

    private int seatID;
    private int flightID;
    private SeatClass seatClass;
    private SeatNumber seatNumber;
    private double baseSeatPrice;

    Seat(int seatID, int flightID, String seatClass, String seatNumber, double seatPrice) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public enum SeatNumber {
        ONE, TWO, THREE, FOUR
    }

    public Seat(int seatID, int flightID, SeatClass seatClass, SeatNumber seatNumber, double baseSeatPrice) {
    this.seatID = seatID;
    this.flightID = flightID;
    this.seatClass = seatClass;
    this.seatNumber = seatNumber;
    this.baseSeatPrice = baseSeatPrice;
}


    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public SeatNumber getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(SeatNumber seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getBaseSeatPrice() {
        return baseSeatPrice;
    }

    public void setBaseSeatPrice(double baseSeatPrice) {
        this.baseSeatPrice = baseSeatPrice;
    }
    
    public double calculateSeatPrice() {
        double seatPrice = getSeatClass().calculateTicketPrice(getBaseSeatPrice());
        return seatPrice;
    }
}

