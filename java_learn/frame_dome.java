package com.gui;

import java.awt.*;

public class frame_dome {
    public static void main(String[] args) {
        Color c2 = new Color(187, 226, 44);
        Frame frame = new Frame("我的第一个Frame程序");
        frame.setVisible(true);
        frame.setSize(300,300);
        Color c1 = new Color(226, 44, 206);
        frame.setBackground(c1);
        frame.setLocation(0,0);
        Frame frame1 = new Frame("我的第一个Frame程序");
        frame1.setVisible(true);
        frame1.setSize(300,300);
        frame1.setBackground(c1);
        frame1.setLocation(300,300);
        Frame f3 = new Frame("生草");
        f3.setVisible(true);
        f3.setBackground(c1);
        f3.setSize(300,300);
        f3.setLocation(600,0);
        Frame f4 = new Frame("草生");
        f4.setVisible(true);
        f4.setSize(300,300);
        f4.setBackground(c1);
        f4.setLocation(900,300);
        Frame f5 = new Frame("你是somebody");
        f5.setVisible(true);
        f5.setBackground(c1);
        f5.setLocation(1200,0);
        f5.setSize(300,300);

        Frame f6 = new Frame("我");
        f6.setVisible(true);
        f6.setSize(300,300);
        f6.setBackground(c1);
        f6.setLocation(0,600);

        Frame f7 = new Frame("是");
        f7.setVisible(true);
        f7.setSize(300,300);
        f7.setBackground(c1);
        f7.setLocation(600,600);

        Frame f8 = new Frame("你");
        f8.setVisible(true);
        f8.setSize(300,300);
        f8.setBackground(c2);
        f8.setLocation(1200,600);
    }
}
