package com.hrishikesh.dp.flyweightpattern;

import java.awt.*;

/**
 * @author hrishikesh.mishra
 */
public class MyRect {

    private Color color;


    public MyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics graphics, int x, int y, int x2, int y2){
        graphics.setColor(color);
        graphics.fillRect(x, y, x2, y2);
    }
}
