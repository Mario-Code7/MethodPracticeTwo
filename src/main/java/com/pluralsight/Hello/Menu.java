package com.pluralsight.Hello;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
        displayMenu();
    }
    public static void displayMenu() {
        System.out.println("""
                === Menu ===
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99
                """);
    }
}
