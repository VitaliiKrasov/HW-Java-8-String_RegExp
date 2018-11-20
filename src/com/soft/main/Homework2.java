package com.soft.main;

import java.io.IOException;

import static com.soft.main.Reader.br;

/**
 * Enter a sentence that contains the words between more than one space.
 * Convert all spaces, consecutive, one.
 * For example, if we introduce the sentence "I    am      learning     Java   Core»,
 * we have to get the "I'm learning Java Core»
 */

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        String sentence = "";
        try {
            sentence = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String clear = sentence.trim().replaceAll("\\s+", " ");
        System.out.println(clear);
    }
}
