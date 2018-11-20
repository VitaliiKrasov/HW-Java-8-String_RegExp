package com.soft.main;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Comparator;

import static com.soft.main.Reader.br;

/**
 * Enter in the console sentence of five words.
 * display the longest word in the sentence
 * determine the number of its letters
 * bring the second word in reverse order
 */
public class Homework1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter sentence of five words");
        String sentence = br.readLine();

        String[] words = sentence.split("\\s+");

        String longestWord = getLongest(words);
        System.out.println(longestWord);

        int longestLength = longestWord.length();
        System.out.println(longestLength);

        StringBuilder sb = new StringBuilder();
        sb.append(words[1]);
        String secondInReverse = sb.reverse().toString();
        System.out.println(secondInReverse);
    }

    public static String getLongest(String[] words) {
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            if (result.length() > result.length()) {
                result =  words[i];
            }
        } return result;
    }
}
