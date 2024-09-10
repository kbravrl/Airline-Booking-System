/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.airline;

import java.time.LocalDateTime;

class BookingSystem {

    private static BookingSystem instance;

    private BookingSystem() {
    }

    public static synchronized BookingSystem getInstance() {
        if (instance == null) {
            instance = new BookingSystem();
        }
        return instance;
    }

    public boolean confirmReservation(Airport airport, Flight flight, Passenger passenger, Seat seat) {
        if (!isSeatTaken(flight, seat)) {
            if (checkPassengerWalletBalance(passenger, seat)) {
                changeSeatStatus(flight, seat);
                changePassengerBalance(passenger, seat);

                System.out.println("Your reservation is confirmed for flight " + flight.getFlightNumber());
                return true;
            }
        }
        System.out.println("The seat is already taken.");
        return false;

    }

    public void cancelReservation(Airport airport, Flight flight, Passenger passenger, Seat seat) {
        if (isSeatTaken(flight, seat)) {
            System.out.println("Your reservation for flight " + flight.getFlightNumber() + " has been canceled.");
        } else {
            System.out.println("No such reservation.");
        }
    }

    private boolean isSeatTaken(Flight flight, Seat seat) {
        return flight.getSeatStatus().getOrDefault(seat, false);
    }

    private boolean checkPassengerWalletBalance(Passenger passenger, Seat seat) {
        if (passenger.getWalletBalance() >= seat.calculateSeatPrice()) {
            return true;
        } else {
            System.out.println("Insufficient balance, your reservation is canceled.");
            return false;
        }
    }

    private void changeSeatStatus(Flight flight, Seat seat) {
        System.out.println(flight.getSeatStatus());
        flight.getSeatStatus().replace(seat, true);
        System.out.println(flight.getSeatStatus());
    }

    private void changePassengerBalance(Passenger passenger, Seat seat) {
        double newPassengerBalance = passenger.getWalletBalance() - seat.calculateSeatPrice();
        passenger.setWalletBalance(newPassengerBalance);
    }

    private Booking createBookingForDatabaseInsertion(Airport airport, Flight flight, Passenger passenger, Seat seat) {
        Booking booking = null;
        if (confirmReservation(airport, flight, passenger, seat)) {
            booking = new Booking(airport.getAirportID(), flight.getFlightID(),
                    passenger.getPassengerID(), seat.getSeatID(), LocalDateTime.now());
        }
        return booking;

    }
}
