package daysofcode30;

import java.util.Scanner;

/**
 * Created by edwin lyu on 10/5/16.
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer
 */
public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
