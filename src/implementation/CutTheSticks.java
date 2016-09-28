package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by wei on 2016/09/28.
 * https://www.hackerrank.com/challenges/cut-the-sticks
 */
public class CutTheSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scanner.nextInt());
        }

        while (Collections.max(al) > 0) {
            int min = findMin(al);
            int count = 0;
            for (int i = 0; i < n; i++) {
                int curr = al.get(i);
                if (curr > 0) count++;
                al.set(i, curr - min);
            }
            System.out.println(count);
        }
    }

    private static int findMin(ArrayList<Integer> al) {
        int min = Integer.MAX_VALUE;
        for (int i : al) {
            if (i > 0 && i < min) {
                min = i;
            }
        }
        return min;
    }
}
