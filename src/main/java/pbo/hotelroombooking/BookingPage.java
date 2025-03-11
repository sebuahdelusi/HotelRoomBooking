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
public class BookingPage extends JFrame {
    private JTextField nameField, nightsField;
    private JRadioButton maleButton, femaleButton;
    private JComboBox<Integer> guestDropdown;
    private JButton bookButton, resetButton, backButton;
    private Room selectedRoom;

    public BookingPage(Room room) {
        this.selectedRoom = room;

        setTitle("Hotel Booking - Booking Page");
        setSize(500, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titleLabel = new JLabel("Booking Room: " + room.getType());
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(150, 20, 250, 24);
        add(titleLabel);
        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 60, 150, 24);
        add(nameLabel);
        
        nameField = new JTextField();
        nameField.setBounds(180, 60, 280, 30);
        add(nameField);
        
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 100, 150, 24);
        add(genderLabel);
        
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        
        maleButton.setBounds(180, 100, 80, 24);
        femaleButton.setBounds(280, 100, 100, 24);
        
        add(maleButton);
        add(femaleButton);
        
        JLabel guestsLabel = new JLabel("Number of Guests:");
        guestsLabel.setBounds(20, 140, 150, 24);
        add(guestsLabel);
        
        Integer[] guestOptions = {1, 2, 3, 4, 5};
        guestDropdown = new JComboBox<>(guestOptions);
        guestDropdown.setBounds(180, 140, 280, 30);
        add(guestDropdown);
        
        JLabel nightsLabel = new JLabel("Length of Stay (nights):");
        nightsLabel.setBounds(20, 180, 180, 24);
        add(nightsLabel);
        
        nightsField = new JTextField();
        nightsField.setBounds(180, 180, 280, 30);
        add(nightsField);
        
        bookButton = new JButton("Book");
        bookButton.setBounds(50, 250, 120, 40);
        add(bookButton);
        
        resetButton = new JButton("Reset");
        resetButton.setBounds(190, 250, 120, 40);
        add(resetButton);
        
        backButton = new JButton("Back");
        backButton.setBounds(330, 250, 120, 40);
        add(backButton);

        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processBooking();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });
        
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainMenuPage();
            }
        });

        setVisible(true);
    }

    private void processBooking() {
        try {
            String name = nameField.getText();
            if (name.isEmpty()) throw new Exception("Name cannot be empty!");

            String gender = maleButton.isSelected() ? "Male" : (femaleButton.isSelected() ? "Female" : "");
            if (gender.isEmpty()) throw new Exception("Select a gender!");

            int guests = (int) guestDropdown.getSelectedItem();
            int nights = Integer.parseInt(nightsField.getText());
            if (nights <= 0) throw new Exception("Nights must be at least 1!");

            Booking booking = new Booking(name, gender, guests, nights, selectedRoom);
            JOptionPane.showMessageDialog(this, booking.getBookingDetails(), "Booking Confirmation", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetForm() {
        nameField.setText("");
        maleButton.setSelected(false);
        femaleButton.setSelected(false);
        guestDropdown.setSelectedIndex(0);
        nightsField.setText("");
    }
}
