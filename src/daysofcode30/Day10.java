package daysofcode30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by edwinlyu on 9/29/16.
 * https://www.hackerrank.com/challenges/30-binary-numbers
 */
public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String str = Integer.toBinaryString(input);
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '1')
                count++;
            else {
                al.add(count);
                count = 0;
            }
        }
        al.add(count);
        if (al.size() > 0)
            System.out.println(Collections.max(al));
        else
            System.out.println(0);
    }
}
