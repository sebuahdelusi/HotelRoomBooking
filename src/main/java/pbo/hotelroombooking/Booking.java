/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.hotelroombooking;

/**
 *
 * @author ThinkPad
 */
public class Booking {
    private String name;
    private String gender;
    private int numberOfGuests;
    private int lengthOfStay;
    private Room room;

    public Booking(String name, String gender, int numberOfGuests, int lengthOfStay, Room room) {
        this.name = name;
        this.gender = gender;
        this.numberOfGuests = numberOfGuests;
        this.lengthOfStay = lengthOfStay;
        this.room = room;
    }

    public double getTotalPrice() {
        return room.calculateTotalPrice(lengthOfStay);
    }

    public String getBookingDetails() {
        return "Name: " + name + "\n" +
               "Gender: " + gender + "\n" +
               "Number of Guests: " + numberOfGuests + "\n" +
               "Room Type: " + room.getType() + "\n" +
               "Total Price: $" + getTotalPrice();
    }
}
