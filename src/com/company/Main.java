package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myTest = "This is a simple text";

String text1 = "My name is ";
String text2 = "John Doe";

String finalTest = text1 +text2;

        System.out.println(finalTest);

        String text3 = "This is ";
        String text4 = "a test";

        String finalText2 = text1.concat(text4);
        System.out.println(finalText2);

        String text5 = "Text to compare";
        String text6 = "Text to compare";

        System.out.println(text5.equals(text6));
        System.out.println(text5.equalsIgnoreCase(text6));

        System.out.println(text5.length());
        System.out.println(text6.toUpperCase());
        System.out.println(text5.toLowerCase());

        System.out.println(finalText2.indexOf("is"));

        //System.out.println(text5.replaceAll(regex: "e", replacement: "i"));

        System.out.printf("100.0 / 3.0 = 5.2f" + 100.0 / 3.0);

        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.3434343434343";
        String booleanStrValue = "true";
        String longStrValue = "10000000000000000";

        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);

        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(longValue);

// Primitive
            int primitiveInteger = 24;

            //Classes
            String classString = "Test String";
          //  String classString2 = new String(original: "Test string 2");

            Scanner scanner = new Scanner(System.in); //when a new scanner is created we would be getting a new instance of that scanner, which means we would be saving the data type
            //of the variable as Scanner

            //creating a list in java
           // List<String> ints = new ArrayList();

            Integer wrapperClassInt = 35;
        Integer wrapperClassInt2 = 34;

        Byte wrapperClassByte = 2;
        Short wrapperClassShort = 200;
         //difference between wrapper classes and primitives
        //Long
        long a = 2_000_000_000;
        long b = 3000000000000L;

       // Long x = 2_000_000_000; //compile error
        Long y = 3000000000L;

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
       // Pattern pattern = Pattern.compile("a+bcde");

       // Matcher matcher = pattern.matcher(input: "aaabcde");

        //System.out.println(matcher.matches);





    }
}
