package com.homeworks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        jFrame.setBounds(300, 300, 300, 300);
        jFrame.setLayout(new GridLayout(1, 2));

        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(1, 3));
        JButton jb1 = new JButton("-1");
        JButton jb2 = new JButton("0");
        JButton jb3 = new JButton("1");
        jp1.add(jb1, BorderLayout.WEST);
        jp1.add(jb3, BorderLayout.EAST);
        jp1.add(jb2, BorderLayout.CENTER);

        jFrame.add(jp1, BorderLayout.WEST);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(3,2));
        JButton jb_01 = new JButton("a");
        JButton jb_02 = new JButton("b");
        JButton jb_03 = new JButton("c");
        JButton jb_04 = new JButton("d");
        JButton jb_05 = new JButton("e");
        JButton jb_06 = new JButton("f");
        jp2.add(jb_01);
        jp2.add(jb_02);
        jp2.add(jb_03);
        jp2.add(jb_04);
        jp2.add(jb_05);
        jp2.add(jb_06);

        jFrame.add(jp2, BorderLayout.EAST);
        jFrame.setVisible(true);

    }
}
