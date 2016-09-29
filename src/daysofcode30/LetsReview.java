package daysofcode30;

import java.util.Scanner;

/**
 * Created by wei on 2016/09/29.
 * Objective
 * Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check
 * out the Tutorial tab for learning materials and an instructional video!
 * <p>
 * Task
 * Given a string, , of length that is indexed from to , print its even-indexed and odd-indexed characters as
 * space-separated strings on a single line (see the Sample below for more detail).
 */
public class LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String output = indice(scanner.nextLine());
            System.out.println(output);
        }
    }

    private static String indice(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            sb1.append(s.charAt(i));
        }
        for (int i = 1; i < s.length(); i += 2) {
            sb2.append(s.charAt(i));
        }
        return sb1.toString() + " " + sb2.toString();
    }
}
