package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        String frameName = "MyPracticeApp";
        this.setVisible(true);
        this.setSize(1200, 900);
        this.setTitle(frameName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon me = new ImageIcon("me.jpg");
        this.setIconImage(me.getImage());
        this.getContentPane().setBackground(new Color(160,160,200));
    }
}

