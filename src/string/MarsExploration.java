package string;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/11/16.
 * https://www.hackerrank.com/challenges/mars-exploration
 */
public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i += 3) {
            count += countChanges(s.substring(i, i + 3));
        }
        System.out.println(count);
    }

    private static int countChanges(String input) {
        int output = 0;
        if (input.charAt(0) != 'S')
            output++;
        if (input.charAt(1) != 'O')
            output++;
        if (input.charAt(2) != 'S')
            output++;
        return output;
    }
}
