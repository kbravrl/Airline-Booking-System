# Airline-Booking-System

## Project Overview

The Airline Booking System is a Java-based application designed to manage airport, flight, passenger, seat, and booking information. The system allows users to perform various operations such as adding airports, flights, passengers, seats, and making bookings. The application interacts with a MySQL database to store and retrieve data.

## Features

- Manage airports, flights, and passengers
- Seat management with price calculation based on seat class
- Booking functionality with date and time management
- Database integration using JDBC

## Installation

### Prerequisites

- Java Development Kit (JDK) 11 or later
- MySQL Server
- JDBC Driver for MySQL

### Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/airline-booking-system.git
   cd airline-booking-system

2. **Set up the MySQL database:**
   - Create a database named `airline_booking_system` in MySQL.
   - Import the provided SQL schema to create the necessary tables. (Include the SQL schema in the repository or as a separate file.)

3. **Update database connection settings:**
   - Open the `DatabaseConnection` class.
   - Update the `URL`, `USER`, and `PASSWORD` constants with your MySQL server details.

4. **Compile and run the project:**
   ```bash
   javac -d bin src/com/example/airline/*.java
   java -cp bin com.example.airline.Test

## ScreenShot
![1](https://github.com/user-attachments/assets/97fd55da-128f-4b3b-9599-e1b940f58ebd)

![2](https://github.com/user-attachments/assets/16f6f5cd-44ff-4a75-b179-6942952574b7)

![3](https://github.com/user-attachments/assets/c84df6a3-f35c-4322-9f6f-5cad6170c8a1)

![4](https://github.com/user-attachments/assets/fbfdc081-0407-4a62-a7c2-806d61520674)

![5](https://github.com/user-attachments/assets/bf8a2a59-e7f6-4573-9c18-7a1bf93f5d95)




