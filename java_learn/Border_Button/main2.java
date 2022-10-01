package com.homeworks;

import javax.swing.*;
import java.awt.*;

public class main2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("A");
        JButton jButton = new JButton("A");
        jFrame.setBounds(0,0,300,300);
        jFrame.add(jButton);
        jFrame.setVisible(true);

        Frame frame = new Frame("B");
        Button button = new Button("B");
        frame.setBounds(0,300,300,300);
        frame.add(button);
        frame.setVisible(true);
    }
}
