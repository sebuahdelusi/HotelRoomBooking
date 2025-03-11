/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.hotelroombooking;

/**
 *
 * @author ThinkPad
 */
public class LargeRoom extends Room{
    public LargeRoom() {
        super("Large", 100.0);
    }

    @Override
    public double calculateTotalPrice(int nights) {
        return nights * pricePerNight;
    }
}
