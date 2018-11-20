package com.soft.main;

import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.soft.main.Reader.br;

/**
 * Implement a pattern for US currency:
 * the first symbol "$", then any number of digits, dot and two digits after the dot.
 * Enter the text from the console that contains several occurrences of US currency.
 * Display all occurrences on the screen.
 */

public class Homework3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter text that contains several occurrences of US currency");
        Pattern pattern = Pattern.compile("\\$(\\d+ )(\\.\\d(2))");
        Matcher matcher = pattern.matcher(br.readLine());
        System.out.println(matcher.matches()? "valid": "not valid");
    }
}
