package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
    public static void main(String[] args) {
        //abcde: finds the pattern "abcde" in the string
        //a+bcde: find the pattern "abcde", "aabcde", "aaabcde" in the string
        //a+bcd+e finds the pattern "abcde". "aabcde", "abcdde" in the string
        //[A-Z] [a-z]+ find the pattern "Abcde", "David", "Anna"

        //dfskjdhfsek cat word work walk
        //wor[a-z]+
        // 1234: "1234"
        //1+234: "111234", "11234"
        //[0-9] {3}

        //Pattern
       // Pattern pattern = Pattern.compile("[A-Z][a-z]+");

        //Matcher matcher = pattern.matcher("This as a sentence that has a name David");

       // System.out.println(matcher.matches());
       // System.out.println(matcher.find());
       // System.out.println(matcher.find());
       // System.out.println(matcher.find());

        //String zino = "Zino";
        //System.out.println(zino.contains("Zino"));
        //System.out.println(zino.matches("[A-Z] [a-z]+"));

        //class example: create a program that checks if the word Java appears in a text; print "Found Java"in the console if yes
        Pattern pattern1 = Pattern.compile("Java");

        Matcher matcher1 = pattern1.matcher("Java is a really cool programming language");

        if(matcher1.find()) {
            System.out.println("Found Java");
        }
//Class Example: regular expression for finding a phone number in a text
        //xxx-xxx-xxxx, xxx.xxx.xxxx
        //numbers can be 123-111-3451, or 123456789 or 234-2134-124
        Pattern pattern2 = Pattern.compile("[0-9]{3}-?.?[0-9]{3}-?.?[0-9]{4}");

        Matcher matcher2 = pattern2.matcher("numbers can be 123-111-3451, or 123456789 or 234-1134-124");

        if(matcher2.find()) {
            System.out.println("Found a phone number in the text!");
        } else {
            System.out.println("This text does not contain any phone numbers");
        }


    }
}
