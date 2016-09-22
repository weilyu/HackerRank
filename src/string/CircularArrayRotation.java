package string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by wei on 2016/09/22.
 * https://www.hackerrank.com/challenges/circular-array-rotation
 */
public class CircularArrayRotation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String[] parameters = scanner.nextLine().split(" ");
//        int n = Integer.parseInt(parameters[0]);
        int k = Integer.parseInt(parameters[1]);
        int q = Integer.parseInt(parameters[2]);

        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> al = new ArrayList<>();
        for (String s : input)
            al.add(Integer.parseInt(s));

        rotate(al, k);

        for (int i = 0; i < q; i++) {
            System.out.println(al.get(Integer.parseInt(scanner.nextLine())));
        }

    }

    private static void rotate(ArrayList<Integer> al, int k) {
        for (int i = 0; i < k; i++) {
            int lastInt = al.get(al.size()-1);
            al.remove(al.size()-1);
            al.add(0, lastInt);
        }
    }
}
