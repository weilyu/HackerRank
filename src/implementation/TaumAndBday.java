package implementation;

import java.util.Scanner;

/**
 * Created by wei on 2016/09/28.
 * https://www.hackerrank.com/challenges/taum-and-bday
 */
public class TaumAndBday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of test cases
        for (int i = 0; i < n; i++) {
            long n1 = scanner.nextInt(); // black gift
            long n2 = scanner.nextInt(); // white gift
            long p1 = scanner.nextInt();
            long p2 = scanner.nextInt();
            long pc = scanner.nextInt(); // convert price
            long minPrice = calcMinPrice(n1, n2, p1, p2, pc);
            System.out.println(minPrice);
        }
    }

    private static long calcMinPrice(long n1, long n2, long p1, long p2, long pc) {
        if (p1 - p2 > pc) {
            return n2 * p2 + n1 * (pc + p2);
        } else if (p2 - p1 > pc) {
            return n1 * p1 + n2 * (pc + p1);
        } else {
            return n1 * p1 + n2 * p2;
        }
    }
}
