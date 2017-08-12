package com.hrishikesh.dp.flyweightpattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @author hrishikesh.mishra
 */
public class FlyWeightTest extends JFrame {

    JButton startDrawing;
    int windowWidth =  1700;
    int windowHeight =  1000;

    Color [] shapeColors = {Color.WHITE, Color.LIGHT_GRAY, Color.GRAY,
            Color.DARK_GRAY, Color.BLACK, Color.RED, Color.PINK,
            Color.ORANGE, Color.YELLOW, Color.GREEN, Color.MAGENTA,
            Color.CYAN, Color.BLUE};


    public FlyWeightTest () {
        this.setSize(windowWidth, windowWidth);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FlyWeight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i=0; i < 100000; i++){
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY() );
                }

                long endTime = System.currentTimeMillis();

                System.out.println("That took : " + (endTime -startTime));
            }
        });

        this.add(contentPane);
        this.setVisible(true);
    }

    private int getRandY() {
        return (int) ( Math.random() * windowHeight);
    }

    private int getRandX() {
        return (int)  (Math.random() * windowWidth);
    }



    private Color getRandColor() {
        Random random = new Random();
        int randInt = random.nextInt(shapeColors.length);
        return shapeColors[randInt];
    }

    public static void main(String[] args) {
        new FlyWeightTest();
    }

}
