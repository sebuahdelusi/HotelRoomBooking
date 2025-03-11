/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.hotelroombooking;

/**
 *
 * @author ThinkPad
 */
public class User {
    private static final String USERNAME = "adm";
    private static final String PASSWORD = "adm";

    public static boolean login(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
