package com.soft.main;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.soft.main.Reader.br;

/**
 * The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
 * Using regular expressions implement checking the user name for validity.
 * Input five names in the main method .
 * Output a message to the console of the validation of each of the entered names
 */

public class Task3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter username");
        String pattern = "^[A-Za-z0-9_][3.15]$";
        Pattern p = Pattern.compile(pattern);
        String username = br.readLine();
        Matcher m = p.matcher(username);

        if(m.matches() == true) {
            System.out.println(username + " is valid");
        } else System.out.println(username + " is  not valid");

    }
}
