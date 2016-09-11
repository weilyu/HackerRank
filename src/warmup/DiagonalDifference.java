package warmup;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/11/16.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i++) {
            matrix[i] = convertLine(in.nextLine());
        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            count+= matrix[i][i];
            count-= matrix[i][num-i-1];
        }
        System.out.println(Math.abs(count));
    }

    /**
     * split string by space and convert to int array
     *
     * @param line
     * @return
     */
    private static int[] convertLine(String line) {
        String[] sArray = line.split(" ");
        int[] output = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            output[i] = Integer.parseInt(sArray[i]);
        }
        return output;
    }
}
