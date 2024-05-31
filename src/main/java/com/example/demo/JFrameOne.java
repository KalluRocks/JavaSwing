package com.example.demo;

import javax.swing.*;
import java.awt.*;

public class JFrameOne {

    public JFrameOne() {
        initialize();
    }

    private void initialize() {
        JFrame frame = new JFrame();
        frame.setTitle("Java Swing Panel Demo");
        frame.setLayout(new BorderLayout(10, 5));
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        frame.add(panel, BorderLayout.SOUTH);
        panel.setBackground(Color.CYAN);

        Button button1 = new Button("Button 1");
        panel.add(button1);

        Button button2 = new Button("Button 2");
        panel.add(button2);

        Button button3 = new Button("Button 3");
        panel.add(button3);

        frame.setVisible(true);
    }
}
