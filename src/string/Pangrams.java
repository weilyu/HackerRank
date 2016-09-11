package string;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/11/16.
 * Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)
 * <p>
 * After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.
 * <p>
 * Given a sentence , tell Roy if it is a pangram or not.
 */
public class Pangrams {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toUpperCase();
        if (input.length() < 26) {
            System.out.println("not pangram");
            return;
        }
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : alph.toCharArray()) {
            if (!input.contains(String.valueOf(c))) {
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
