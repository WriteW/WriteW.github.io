package com.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Panel_Dome {
    public static void main(String[] args) {
        Frame frame = new Frame("title");
        frame.setBounds(50, 50, 100, 100);
        frame.setBackground(Color.RED);
        frame.setLayout(null);

        Panel panel = new Panel();
        panel.setBounds(1, 20, 50, 50);
        panel.setBackground(Color.green);

        frame.add(panel);

        frame.setVisible(true);
        panel.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

            }
        });
    }
}
