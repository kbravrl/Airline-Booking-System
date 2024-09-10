/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example.airline;

enum SeatClass {
    FIRST {
        @Override
        public double calculateTicketPrice(double basePrice) {
            double price = basePrice * 70 / 100;
            return price;
        }
    },
    BUSINESS {
        @Override
        public double calculateTicketPrice(double basePrice) {
            double price = basePrice * 40 / 100;
            return price;
        }
    },

    ECONOMY {
        @Override
        public double calculateTicketPrice(double basePrice) {
            double price = basePrice * 30 / 100;
            return price;
        }
    };
    
    public abstract double calculateTicketPrice(double basePrice);
    
    
}
