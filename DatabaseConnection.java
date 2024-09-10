/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.airline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/airline_booking_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    static void insertAirport(Airport airport) throws SQLException {
        String query = "INSERT INTO Airport (airportID, airportNumber, city, country) VALUES (?, ?, ?, ?)";
        try ( Connection conn = getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, airport.getAirportID());
            pstmt.setString(2, airport.getAirportNumber());
            pstmt.setString(3, airport.getCity());
            pstmt.setString(4, airport.getCountry());
            pstmt.executeUpdate();
        }
    }

    static void insertFlight(Flight flight) throws SQLException {
        String query = "INSERT INTO Flight (flightID, flightNumber, departureDate, departureAirport, destinationAirport, departureTime, arrivalTime) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try ( Connection conn = getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, flight.getFlightID());
            pstmt.setString(2, flight.getFlightNumber());
            pstmt.setDate(3, java.sql.Date.valueOf(flight.getDepartureDate()));
            pstmt.setInt(4, flight.getDepartureAirport());
            pstmt.setInt(5, flight.getDestinationAirport());
            pstmt.setTime(6, java.sql.Time.valueOf(flight.getDepartureTime()));
            pstmt.setTime(7, java.sql.Time.valueOf(flight.getArrivalTime()));
            pstmt.executeUpdate();
        }
    }

    static void insertPassenger(Passenger passenger) throws SQLException {
        String query = "INSERT INTO Passenger (passengerID, firstName, lastName, phoneNumber, email) VALUES (?, ?, ?, ?, ?)";
        try ( Connection conn = getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, passenger.getPassengerID());
            pstmt.setString(2, passenger.getFirstName());
            pstmt.setString(3, passenger.getLastName());
            pstmt.setString(4, passenger.getPhoneNumber());
            pstmt.setString(5, passenger.getEmail());
            pstmt.executeUpdate();
        }
    }

    static void insertSeat(Seat seat) throws SQLException {
        String query = "INSERT INTO Seat (seatID, flightID, seatClass, seatNumber, baseSeatPrice) VALUES (?, ?, ?, ?, ?)";
        try ( Connection conn = getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, seat.getSeatID());
            pstmt.setInt(2, seat.getFlightID());
            pstmt.setString(3, seat.getSeatClass().name());
            pstmt.setString(4, seat.getSeatNumber().name());
            pstmt.setDouble(5, seat.calculateSeatPrice());
            pstmt.executeUpdate();
        }
    }

    static void insertBooking(Booking booking) throws SQLException {
        String query = "INSERT INTO Booking (airportID, flightID, passengerID, seatID, bookingDate) VALUES (?, ?, ?, ?, ?)";
        try ( Connection conn = getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, booking.getAirportId());
            pstmt.setInt(2, booking.getFlightId());
            pstmt.setInt(3, booking.getPassengerId());
            pstmt.setInt(4, booking.getSeatId());
            pstmt.setTimestamp(5, java.sql.Timestamp.valueOf(booking.getBookingDate()));
            pstmt.executeUpdate();
        }
    }
}
