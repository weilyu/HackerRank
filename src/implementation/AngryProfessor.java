package implementation;

import java.util.Scanner;

/**
 * Created by wei on 2016/09/22.
 * https://www.hackerrank.com/challenges/angry-professor
 */
public class AngryProfessor {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        final int T = Integer.parseInt(scanner.nextLine()); //number of test cases

        for (int i = 0; i < T; i++) {
            runTestCase(scanner);
        }
    }

    private static void runTestCase(Scanner scanner) {
        String[] nk = scanner.nextLine().split(" ");
//        final int N = Integer.parseInt(nk[0]); //number of students
        final int K = Integer.parseInt(nk[1]); //number of minimum students to start class
        String[] arriveTime = scanner.nextLine().split(" ");
        int count = 0;
        for (String s : arriveTime)
            if (Integer.parseInt(s) <= 0)
                count++;
        if (count >= K)
            System.out.println("NO");
        else
            System.out.println("YES"); //class cancelled
    }
}
