package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    //main function
    public static void main(String[] args) {
        mainFrame(); //call mainFrame function
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
        ImageIcon me = new ImageIcon("me.jpg");
        myLabel.setIcon(me);

        //create frame
        MyFrame myFrame = new MyFrame(); //create frame

        //adding label to frame
        myFrame.add(myLabel);
    }

}
