package com.bridgelabz.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp3 {
    static Pattern pattern = Pattern.compile("abc.[a-z]{3,}@bl.co.[a-z]{2}$");

    public static void main(String[] args) { 
        String testString = "abc.zzz@bl.co.in";
        Matcher matcher = pattern.matcher(testString);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    }
}
