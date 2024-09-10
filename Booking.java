package com.example.airline;

import java.time.LocalDateTime;

public class Booking {
    private int id;
    private int airportId;
    private int flightId;
    private int passengerId;
    private int seatId;
    private LocalDateTime BookingDate;

    public Booking(int airportId, int flightId, int passengerId, int seatId, LocalDateTime BookingDate) {
        this.airportId = airportId;
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.seatId = seatId;
        this.BookingDate = BookingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public LocalDateTime getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(LocalDateTime reservationDate) {
        this.BookingDate = reservationDate;
    }    
}
