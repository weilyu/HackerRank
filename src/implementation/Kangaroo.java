package implementation;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/27/16.
 * https://www.hackerrank.com/challenges/kangaroo
 */
public class Kangaroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int x1 = Integer.parseInt(input[0]);
        int v1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int v2 = Integer.parseInt(input[3]);

        while (true) {
            if (x1 == x2) {
                System.out.println("YES");
                return;
            }
            if (x2 > x1 && v2 >= v1) {
                System.out.println("NO");
                return;
            }
            if (x2 < x1 && v2 <= v1) {
                System.out.println("NO");
                return;
            }
            x1 += v1;
            x2 += v2;
        }
    }
}
