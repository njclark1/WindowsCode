/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.syntaxreview;

/**
 *
 * @author Nick
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
    JButton button = new JButton("submit");
    JTextField field = new JTextField(10);
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());   
        String frameName = "MyPracticeApp";
        button.addActionListener(this);
        field.setPreferredSize(new Dimension(250,40));   
        this.setVisible(true);
        this.setSize(1200, 900);
        this.setTitle(frameName);
        this.setResizable(false);
        ImageIcon me = new ImageIcon("me.jpg");
        this.setIconImage(me.getImage());
        this.getContentPane().setBackground(new Color(160,160,200));
        this.add(button);
        this.add(field);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource()==button) {
            field.getText();
            System.out.println("welcome " + field.getText());
        }
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