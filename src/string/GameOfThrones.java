package string;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by edwinlyu on 9/27/16.
 * https://www.hackerrank.com/challenges/game-of-thrones
 */
public class GameOfThrones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        HashMap<Character, Integer> charNum = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (charNum.containsKey(c)) {
                int curr = charNum.get(c);
                charNum.put(c, curr + 1);
            } else {
                charNum.put(c, 1);
            }
        }

        //count the number of odd characters
        int countOdd = 0;
        for (int i : charNum.values()) {
            if (i % 2 != 0) {
                countOdd++;
            }
        }

        if (countOdd > 1)
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}
