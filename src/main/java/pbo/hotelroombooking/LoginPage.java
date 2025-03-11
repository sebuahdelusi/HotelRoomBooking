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
public  class LoginPage extends JFrame{
    private JTextField usernameTextField;
    private JPasswordField passwordTextField;
    private JButton loginButton;

    public LoginPage() {
        setTitle("Joy Hotel Login Menu");
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
//        setLayout(new GridLayout(3, 2));

        JLabel usernameField = new JLabel("Username: ");
        JLabel passwordField = new JLabel("Password: ");
        JLabel titleLabel = new JLabel("Welcome to Joy Hotel");

        JTextField usernameTextField = new JTextField();
        JPasswordField passwordTextField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        
        add(usernameField);
        add(passwordField);
        add(usernameTextField);
        add(passwordTextField);
        add(loginButton);
        add(titleLabel);
        
        
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(80, 20, 250, 30);
        usernameField.setBounds(50, 70, 100, 25);
        passwordField.setBounds(50, 110, 100, 25);
        usernameTextField.setBounds(150, 70, 180, 25);
        passwordTextField.setBounds(150, 110, 180, 25);
        loginButton.setBounds(150, 160, 100, 30);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = new String(passwordTextField.getPassword());

                if (User.login(username, password)) {
                    dispose();
                    new MainMenuPage();
                } else {
                    SwingUtilities.invokeLater(() -> {  
                        JOptionPane.showMessageDialog(LoginPage.this, "Invalid login!", "Error", JOptionPane.ERROR_MESSAGE);
                    });
                    usernameTextField.setText("");
                    passwordTextField.setText("");
                }
            }
        });

        setVisible(true);
    }
}
