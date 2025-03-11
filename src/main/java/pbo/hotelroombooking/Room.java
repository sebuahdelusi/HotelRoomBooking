/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.hotelroombooking;

/**
 *
 * @author ThinkPad
 */
public abstract class Room {
    protected String type;
    protected double pricePerNight;

    public Room(String type, double pricePerNight) {
        this.type = type;
        this.pricePerNight = pricePerNight;
    }

    public abstract double calculateTotalPrice(int nights);

    public String getType() {
        return type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}
