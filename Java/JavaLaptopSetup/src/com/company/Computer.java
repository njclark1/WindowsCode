package com.company;

public class Computer {
    //attributes
    String name;
    String owner;
    String cpu;
    String gpu;
    String moboChipset;
    String moboSocket;
    int ramQty;
    int ramSpd;
    boolean isOn;

    //constructor
    Computer(String n, String o, String c, String g, String mc, String ms, int rq, int rs, boolean io) {
        this.name = n;
        this.owner = o;
        this.cpu = c;
        this.gpu = g;
        this.moboChipset = mc;
        this.moboSocket = ms;
        this.ramQty = rq;
        this.ramSpd = rs;
        this.isOn = io;
    }

    //turn computer on
    void turnComputerOn() {
        this.isOn = true;
        System.out.println(this.name + " is now on.");
    }

    //turn computer off
    void turnComputerOff() {
        this.isOn = false;
        System.out.println(this.name + " is now off.");
    }

    //function to print off pc specs
    void printSpecs() {
        System.out.println(owner + "'s " + name + " has a " + cpu +
                " cpu and a " + gpu + " gpu" + " running on an " + moboSocket + " " + moboChipset + " Motherboard and " +
                ramQty + "gb of " + ramSpd + "mhz ram.\n");
    }
}
