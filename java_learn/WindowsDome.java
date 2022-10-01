package com.gui;

import java.awt.*;

public class WindowsDome {
    public static void main(String[] args) {
        int v = 1;
        int Loc = 0;
        for (int i = 0; i < 25; i++) {
            new Windows_new(String.valueOf(v), Color.green, Loc, Loc, 300, 300);
            Loc += 20;
            v++;
        }
        int LocX = 500;
        Loc = 0;
        for (int i = 0; i < 25; i++) {
            new Windows_new(String.valueOf(v), Color.green, LocX, Loc, 300, 300);
            LocX += 20;
            Loc += 20;
            v++;
        }
        int LX = 0;
        boolean isRed = true;
        for (int i = 0; i < 60; i++) {
            Color color;
            if (isRed) {
                color = Color.red;
            }else{
                color = Color.blue;
            }
            new Windows_new(String.valueOf(v), color, LX, 150, 300, 300);
            LX += 20;
            v++;
            isRed = !isRed;
        }
    }
}
