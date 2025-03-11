/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.hotelroombooking;

/**
 *
 * @author ThinkPad
 */
public class SmallRoom extends Room{
    public SmallRoom() {
        super("Small", 50.0);
    }

    @Override
    public double calculateTotalPrice(int nights) {
        return nights * pricePerNight;
    }
}
