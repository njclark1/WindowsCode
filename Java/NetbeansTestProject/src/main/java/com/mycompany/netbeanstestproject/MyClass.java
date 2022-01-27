/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netbeanstestproject;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nick
 */
public class MyClass {
    public static void main(String[] args) {
        System.out.println("hello world");
        mainFrame();
    }
    
        //first frame of the application
    public static void mainFrame() {
        //creating label for frame
        JLabel myLabel = new JLabel(); //create label

        //label text
        String labelText = "THIS PICTURE IS SO OLD OMG";
        myLabel.setHorizontalTextPosition(JLabel.CENTER);
        myLabel.setVerticalAlignment(JLabel.CENTER);
        myLabel.setText(labelText); //set label text
        myLabel.setForeground(new Color(120,10,150));
        myLabel.setFont(new Font("myFont", Font.BOLD, 50));

        //label icon image
        ImageIcon me = new ImageIcon("C:\\Users\\Nick\\source\\repos\\njclark1\\WindowsCode\\Java\\NetbeansTestProject\\src\\main\\java\\me.jpg");
        myLabel.setIcon(me);

        //create frame
        MyFrame myFrame = new MyFrame(); //create frame

        //adding label to frame
        myFrame.add(myLabel);
    }
}
