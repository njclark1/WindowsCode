/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.syntaxreview;

/**
 *
 * @author Nick - nickj.clark14@gmail.com
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("submit Name");
    JButton buttonNumLines = new JButton("submit numLines");
    JButton buttonAdd = new JButton("add these");
    JTextField field = new JTextField(10);
    JTextField fieldNumLines = new JTextField(10);
    JTextField fieldNumAdd1 = new JTextField(10);
    JTextField fieldNumAdd2 = new JTextField(10);

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String frameName = "MyPracticeApp";
        button.addActionListener(this);
        field.setPreferredSize(new Dimension(250, 40));
        buttonNumLines.addActionListener(this);
        fieldNumLines.setPreferredSize(new Dimension(250, 40));
        buttonAdd.addActionListener(this);
        fieldNumAdd1.setPreferredSize(new Dimension(250, 40));
        fieldNumAdd2.setPreferredSize(new Dimension(250, 40));
        this.setVisible(true);
        this.setSize(1200, 900);
        this.setTitle(frameName);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(160, 160, 200));
        this.add(button);
        this.add(field);
        this.add(buttonNumLines);
        this.add(fieldNumLines);
        this.add(buttonAdd);
        this.add(fieldNumAdd1);
        this.add(fieldNumAdd2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            field.getText();
            System.out.println("welcome " + field.getText());
        } else if (e.getSource() == buttonNumLines) {
            String numLinesString = fieldNumLines.getText();
            int numLines = Integer.parseInt(numLinesString);
            PracticeFunctions.fizzBuzz(numLines);
        } else if (e.getSource() == buttonAdd) {
            int num1 = Integer.parseInt(fieldNumAdd1.getText());
            int num2 = Integer.parseInt(fieldNumAdd2.getText());
            PracticeFunctions.addMe(num1, num2);
        }
    }

    public static void mainFrame() {
        //creating label for frame
        JLabel myLabel = new JLabel(); //create label

        //label text
        String labelText = "Welcome to my Java app";
        myLabel.setHorizontalTextPosition(JLabel.CENTER);
        myLabel.setVerticalAlignment(JLabel.CENTER);
        myLabel.setText(labelText); //set label text
        myLabel.setForeground(new Color(120, 10, 150));
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
