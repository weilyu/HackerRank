package implementation;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/27/16.
 * https://www.hackerrank.com/challenges/chocolate-feast
 */
public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); //total money
            int c = scanner.nextInt(); //chocolate price
            int m = scanner.nextInt(); //exchange rate
            int total = calculate(n, c, m);
            System.out.println(total);
        }
    }

    private static int calculate(int n, int c, int m) {
        int total = n / c;
        int wrapper = total;

        while (wrapper >= m) {
            total += (wrapper / m);
            wrapper = wrapper % m + wrapper / m;
        }

        return total;
    }
}
