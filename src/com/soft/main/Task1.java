package com.soft.main;

import java.io.IOException;

import static com.soft.main.Reader.br;

/**
 * Enter surname, name and patronymic on the console as a variable of type String.
 * Output on the console:
 *  - surnames and initials
 *  - name
 *  - name, middle name and last name
 */

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter surname, name and patronymic");
        String inputString = br.readLine();

        String[] names = inputString.split("\\s+");

        String surnamesAndInitials = String.format("%s %s. %s.",
                names[0], names[1].charAt(0), names[2].charAt(0));
        System.out.println(surnamesAndInitials);

        System.out.println(names[1]);

        String nameMiddleLast = String.format("%s %s %s", names[1], names[0], names[2]);
        System.out.println(nameMiddleLast);
    }
}
