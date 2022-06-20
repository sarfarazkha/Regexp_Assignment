package com.bridgelabz.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp4 {
    static Pattern pattern = Pattern.compile("[0-9]{2} [0-9]{10}");

    public static void main(String[] args) {
        String testString = "91 9999999999";
        Matcher matcher = pattern.matcher(testString);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    }
}