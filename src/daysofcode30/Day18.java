package daysofcode30;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by edwinlyu on 10/5/16.
 */
public class Day18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }


    LinkedList<Character> list = new LinkedList<>();

    public void pushCharacter(char c) {
        list.add(c);
    }

    public void enqueueCharacter(char c) {
        list.add(c);
    }

    public char popCharacter() {
        char toPop = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return toPop;
    }

    public char dequeueCharacter() {
        char toDequeue = list.get(0);
        list.remove(0);
        return toDequeue;
    }
}
