package daysofcode30;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/30/16.
 * https://www.hackerrank.com/challenges/30-inheritance
 */
public class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public String calculate() {
        int totalScore = 0;
        for (int i : testScores) totalScore += i;
        int averageScore = totalScore / testScores.length;
        if (averageScore >= 90) return "O";
        else if (averageScore >= 80) return "E";
        else if (averageScore >= 70) return "A";
        else if (averageScore >= 55) return "P";
        else if (averageScore >= 40) return "D";
        else return "T";
    }
}
