package com.homeworks;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static java.awt.BorderLayout.SOUTH;

public class main1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(300, 300, 300, 300);
        jFrame.setLayout(new GridLayout(2, 3));

        JPanel jp1 = new JPanel();
        jp1.setLayout(new BorderLayout(2, 3));

        JButton btn_01 = new JButton("1");
        JButton btn_03 = new JButton("2");

        jp1.add(btn_01, BorderLayout.WEST);
        jp1.add(btn_03, BorderLayout.EAST);

        JPanel jp1_01 = new JPanel();
        jp1_01.setLayout(new GridLayout(2, 1));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        jp1_01.add(b1);
        jp1_01.add(b2);

        jp1.add(jp1_01, BorderLayout.CENTER);

        jp1.setBounds(0, 50, 300, 150);

        jFrame.add(jp1);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new BorderLayout(2, 3));

        JButton btn_02 = new JButton("a");
        JButton btn_04 = new JButton("b");

        jp2.add(btn_02, BorderLayout.WEST);
        jp2.add(btn_04, BorderLayout.EAST);
        jp2.setBounds(0, 150, 300, 150);

        JPanel jp_02 = new JPanel();
        jp_02.setLayout(new GridLayout(2, 2));
        JButton btn_001 = new JButton("1");
        JButton btn_002 = new JButton("2");
        JButton btn_003 = new JButton("3");
        JButton btn_004 = new JButton("4");
        jp_02.add(btn_001);
        jp_02.add(btn_002);
        jp_02.add(btn_003);
        jp_02.add(btn_004);
        jp2.add(jp_02, BorderLayout.CENTER);
        jFrame.add(jp2);
        jFrame.setVisible(true);
    }
}
