package com.bridgelabz.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp8 {
    static Pattern pattern = Pattern.compile("([0-9]*[A-Z]){3,}@[0-9a-zA-Z]$");

    public static void main(String[] args) {
        String testString = "09ss@11";
        Matcher matcher = pattern.matcher(testString);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");

        }


    }
}