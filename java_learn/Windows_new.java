package com.gui;

import java.awt.*;

public class Windows_new {
    static int NoneX = 300;
    static int NoneY = 300;
    public Windows_new(String title, Color color, int x, int y, int w, int h){
        Frame frame = new Frame(title);
        frame.setVisible(true);
        frame.setBackground(color);
        frame.setLocation(x, y);
        frame.setSize(w, h);
        frame.setAlwaysOnTop(true);
    }
}
