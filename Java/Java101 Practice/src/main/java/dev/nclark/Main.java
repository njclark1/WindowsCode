package dev.nclark;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello There");

//        int is primitive. Integer is a class that autoboxes to int.
//        Use primitives if possible and classes as needed

        final Integer i1 = Integer.valueOf(85);
        final int i = 1;
        System.out.println(i1);
        final Integer i2 = i1 + i;
        System.out.println(i2);

//        Lists are fun. There are two different .remove functions. One removes an object, the other an index.
//        Remove by index will remove that indexed value in the list.
//        Remove by object will remove an object value(such as Integer) by reference.
        final List<Integer> li = new ArrayList<>();
        final int ia = 3;
        final Integer ib = 5;
        li.add(1);
        li.add(2);
        li.add(ia);
        li.add(4);
        li.add(ib);

        //removes the 3rd item on the list
        li.remove(ia);
        //removes the value associated with the primitive int ib
        li.remove(ib);
        System.out.println(li);

//        This section of code will create a null pointer exception demonstrating
//        that using objects for data(Double) can create issues if null because d1 IS a pointer set to null

        /*
        final double d = 1.0d;
        final Double d1 = null;
        final Double d2 = (d + d1.doubleValue());
        System.out.println(d2);
        */

//        create instance of pet using the of constructor
        Pet luna = Pet.of(1, "Luna", "Cat", "Female", 9, 001, 002);
//        use getter to get a field from the object
        String lunaName = luna.getName();
//        print result from getter
        System.out.println(lunaName);
    }
}
