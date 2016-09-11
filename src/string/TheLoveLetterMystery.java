package string;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/11/16.
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
 */
public class TheLoveLetterMystery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            int reduceTimes = countReduce(in.nextLine());
            System.out.println(reduceTimes);
        }
    }

    private static int countReduce(String s) {
        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            int reduce = s.charAt(i) - s.charAt(s.length() - 1 - i);
            count += Math.abs(reduce);
        }
        return count;
    }
}
