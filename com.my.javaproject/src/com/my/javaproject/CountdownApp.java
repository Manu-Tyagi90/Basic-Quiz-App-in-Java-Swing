package com.my.javaproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountdownApp {
    private int currentNumber = 5;
    private JLabel countdownLabel;
    private final JDialog dialog; 

    public CountdownApp() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentNumber > 0) {
                    currentNumber--;
                    countdownLabel.setText(String.valueOf(currentNumber));

                } 
                
                else if (currentNumber==0) {
                    dialog.dispose();
                    
                }
                else {
                	System.out.println("Error");
                }
            }
        });

        Frame window = new Frame();
        dialog = new JDialog(window, "Countdown", true);
        dialog.getContentPane().setBackground(new Color(0, 255, 64));
        dialog.setBackground(new Color(0, 255, 64));
        countdownLabel = new JLabel(String.valueOf(currentNumber), SwingConstants.CENTER);
        countdownLabel.setFont(new Font("Arial", Font.BOLD, 55)); // Increase the font size

        dialog.getContentPane().add(countdownLabel);
        dialog.setBounds(100, 100, 450, 300);
        dialog.setLocationRelativeTo(null);
        timer.setRepeats(true);
        timer.start();
        dialog.setVisible(true);
        Quiz1 quiz = new Quiz1();
        quiz.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountdownApp());
    }
}
