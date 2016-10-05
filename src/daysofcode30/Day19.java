package daysofcode30;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by edwin lyu on 10/5/16.
 * https://www.hackerrank.com/challenges/30-interfaces
 */
public class Day19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator2();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}

interface AdvancedArithmetic {
    int divisorSum(int n);
}

// Changed the class name to avoid duplicate classes
class Calculator2 implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        HashSet<Integer> divisor = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisor.add(i);
                divisor.add(n / i);
            }
        }
        int total = 0;
        for (int i : divisor)
            total += i;
        return total;
    }
}
