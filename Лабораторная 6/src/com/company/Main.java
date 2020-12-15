package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        //Frame settings
        JFrame Lab6 = new JFrame("Lab6");
        Lab6.setSize(new Dimension(400,300));
        Lab6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lab6.setLocationRelativeTo(null);
        Lab6.setLayout(new GridBagLayout());

        //Fonts
        Font NewTimesRoman = new Font("Times new roman",Font.BOLD,20);
        Font MSSansSerif = new Font("MS Sans Serif",Font.BOLD,20);
        Font CourierNew = new Font("Courier New",Font.BOLD,20);
        //MenuBar
        JMenuBar menubar = new JMenuBar();
        Lab6.setJMenuBar(menubar);

        //Menu Items
        JMenuItem font1 = new JMenuItem("Times New Roman");
        JMenuItem font2 = new JMenuItem("MS Sans Serif");
        JMenuItem font3 = new JMenuItem("Courier New");
        JMenuItem color1 = new JMenuItem("Black");
        JMenuItem color2 = new JMenuItem("Blue");
        JMenuItem color3 = new JMenuItem("Red");

        //Font Menu
        JMenu FontMenu = new JMenu("Font");
        menubar.add(FontMenu);
        FontMenu.add(font1);
        FontMenu.add(font2);
        FontMenu.add(font3);

        //Color Menu
        JMenu ColorMenu = new JMenu("Color");
        menubar.add(ColorMenu);
        ColorMenu.add(color1);
        ColorMenu.add(color2);
        ColorMenu.add(color3);

        //TextArea
        JTextArea text = new JTextArea();
        Lab6.add(text);

        //ActionListener for colors
        color1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLACK);
            }
        });

        color2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLUE);
            }
        });

        color3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.RED);
            }
        });

        //ActionListener for fonts
        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(NewTimesRoman);
            }
        });
        font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(MSSansSerif);
            }
        });
        font3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(CourierNew);
            }
        });

        //Visible
        Lab6.setVisible(true);
    }
}
