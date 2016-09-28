package implementation;

import java.util.Scanner;

/**
 * Created by wei on 2016/09/28.
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numClouds = scanner.nextInt();
        int[] clouds = new int[numClouds];
        for (int i = 0; i < numClouds; i++) {
            clouds[i] = scanner.nextInt();
        }
        int position = 0;
        int steps = 0;
        int countJump = cloudJump(clouds, position, steps);
        System.out.println(countJump);
    }

    private static int cloudJump(int[] clouds, int position, int steps) {
        if (position + 1 == clouds.length - 1 ||
                position + 2 == clouds.length - 1) {
            return steps + 1;
        }
        if (clouds[position] == 1) return Integer.MAX_VALUE;
        else {
            return Math.min(cloudJump(clouds, position + 1, steps + 1),
                    cloudJump(clouds, position + 2, steps + 1));
        }
    }
}
