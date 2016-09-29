package daysofcode30;

import java.util.Scanner;

/**
 * Created by edwin lyu on 9/29/16.
 * Write a factorial function that takes a positive integer, N as a
 * parameter and prints the result of N! ( factorial).
 */
public class Day9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = factorial(input);
        System.out.println(output);
    }

    private static int factorial(int input) {
        if (input == 1) return input;
        else return input * factorial(input - 1);
    }
}
