package com.bridgelabz.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
    static Pattern pattern = Pattern.compile("[A-Z]{3,}$");

    public static void main(String[] args) {
        String testString = "ABB";
        Matcher matcher = pattern.matcher(testString);

        if (matcher.matches()) {
            System.out.println("matches");

        } else { 
            System.out.println("not matching");
        }
    }
}
