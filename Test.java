package com.example.airline;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.SwingUtilities;

public class Test {
    public static void main(String[] args) {
        try {
            Airport airport = new Airport(1, "ARN", "Stockholm", "Sweden");
            Airport destinationAirport = new Airport(2, "JFK", "New York", "USA");
            Passenger passenger = new Passenger(1, "Oliver", "Brown", "123456789", "oliver.brw@example.com");
            Flight flight = new Flight(2, "FL123", LocalDate.now(), airport.getAirportID(), destinationAirport.getAirportID(), LocalTime.of(10, 0), LocalTime.of(12, 0));
            Seat seat = new Seat(2, flight.getFlightID(), SeatClass.ECONOMY, Seat.SeatNumber.ONE, 100.0);
            
            passenger.setWalletBalance(1000);
            
            DatabaseConnection.insertAirport(airport);
            DatabaseConnection.insertAirport(destinationAirport);
            
            DatabaseConnection.insertPassenger(passenger);
            DatabaseConnection.insertFlight(flight);
            DatabaseConnection.insertSeat(seat);

            BookingSystem bookingSystem = BookingSystem.getInstance();
            bookingSystem.confirmReservation(airport, flight, passenger, seat);

            DatabaseConnection.insertBooking(new Booking(airport.getAirportID(), flight.getFlightID(), passenger.getPassengerID(), seat.getSeatID(), LocalDateTime.now()));
            
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

