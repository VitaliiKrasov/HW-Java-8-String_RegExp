package com.soft.main;

import java.io.IOException;

import static com.soft.main.Reader.br;

/**
 *  Enter the two variables of type String. Determine whether the first variable substring second.
 *  For example, if you typed «IT» and «IT Academy» you must receive true.
 */

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the two variables of type String.");
        String first = br.readLine();
        String second = br.readLine();

        System.out.println(second.startsWith(first));
    }
}
