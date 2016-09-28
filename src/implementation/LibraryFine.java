package implementation;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by wei on 2016/09/28.
 * https://www.hackerrank.com/challenges/library-fine
 */
public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actDay = scanner.nextInt();
        int actMon = scanner.nextInt();
        int actYear = scanner.nextInt();
        int expDay = scanner.nextInt();
        int expMon = scanner.nextInt();
        int expYear = scanner.nextInt();
        scanner.close();

        GregorianCalendar expCalendar = new GregorianCalendar(expYear, expMon, expDay);
        GregorianCalendar actCalendar = new GregorianCalendar(actYear, actMon, actDay);
        if (actCalendar.before(expCalendar)) {
            System.out.println(0);
            return;
        }

        if (actYear > expYear) {
            System.out.println(10000);
        } else if (actMon > expMon) {
            System.out.println((actMon - expMon) * 500);
        } else {
            System.out.println((actDay - expDay) * 15);
        }
    }
}
