package string;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/11/16.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 1;
        for (char c : s.toCharArray()) {
            if (alph.contains(String.valueOf(c)))
                count++;
        }
        System.out.println(count);
    }
}
