/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netbeanstestproject;

/**
 *
 * @author Nick
 */

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
        ImageIcon me = new ImageIcon("C:\\Users\\Nick\\source\\repos\\njclark1\\WindowsCode\\Java\\NetbeansTestProject\\src\\main\\java\\me.jpg");
        this.setIconImage(me.getImage());
        this.getContentPane().setBackground(new Color(160,160,200));
    }
}