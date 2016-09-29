package daysofcode30;

import java.util.Scanner;

/**
 * Created by wei on 2016/09/29.
 * Objective
 * Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an
 * instructional video!
 * <p>
 * Task
 * Given an array, , of integers, print 's elements in reverse order as a single line of space-separated numbers.
 */
public class Day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf(arr[i] + "");
            if (i != 0) System.out.printf(" ");
        }
    }
}
