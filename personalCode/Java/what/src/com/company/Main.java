package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String x = "hello\nCats";
        System.out.println(x);
        System.out.println(x.charAt(0));
        x += " and dogs";
        System.out.println(x);

        System.out.println(x.length());
        String chickenpie = "yummmmmmm....my oh my chicken pot pie";
        System.out.println(x.charAt(x.length()-1));
        String fullAd = chickenpie + " Now with 20% more chicken";
        System.out.println(fullAd);
        System.out.println(fullAd.contains("chicken"));
        System.out.println(fullAd.indexOf("my", fullAd.indexOf("my")+1));
        System.out.println(fullAd.lastIndexOf("my"));
        System.out.println(fullAd.toUpperCase(Locale.ROOT));
    }
}
