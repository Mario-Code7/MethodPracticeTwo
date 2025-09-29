package com.pluralsight.Hello;

import java.util.Scanner;

public class Hello {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sayHellWorld("Hello, World!");
        sayGoodbye("Goodbye!");
        sayGoodMorning("Good Morning!");
    }
    public static void sayHellWorld(String sayHelloWorld) {
        System.out.println("Hello, World!");
    }
    public static void sayGoodbye(String sayGoodbye) {
        System.out.println("Goodbye!");
    }
    public static void sayGoodMorning(String sayGoodMorning) {
        System.out.println("Good Morning!");
    }
}
