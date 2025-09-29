package com.pluralsight.Hello;

import java.util.Scanner;

public class CompareNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
}
