/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.hotelroombooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ThinkPad
 */
public class MainMenuPage extends JFrame {
    public MainMenuPage() {
        setTitle("Main Menu - Joy Hotel");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titleLabel = new JLabel("Select Room Type:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(150, 20, 250, 24);
        add(titleLabel);

        JButton smallRoomButton = new JButton("Small Room - $50/night");
        smallRoomButton.setBounds(100, 80, 300, 40);
        add(smallRoomButton);

        JButton largeRoomButton = new JButton("Large Room - $100/night");
        largeRoomButton.setBounds(100, 140, 300, 40);
        add(largeRoomButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(200, 200, 100, 30);
        add(backButton);
        
        smallRoomButton.addActionListener(e -> {
            dispose();
            new BookingPage(new SmallRoom());
        });

        largeRoomButton.addActionListener(e -> {
            dispose();
            new BookingPage(new LargeRoom());
        });
        
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginPage();
            }
        });

        setVisible(true);
    }
}
