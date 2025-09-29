package com.pluralsight.Hello;

import java.util.Scanner;

public class Format {
    static Scanner scanner = new Scanner(System.in);
    public static String formatName(String first, String last) {
        return last + ", " + first;
    }

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Wick";

        String formatted = formatName(firstName, lastName);
        System.out.println(formatted);
    }
}
