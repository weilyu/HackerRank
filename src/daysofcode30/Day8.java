package daysofcode30;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by wei on 2016/09/29.
 */
public class Day8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numPerson = scanner.nextInt();
        HashMap<String, String> phoneBook = new HashMap<>();
        for (int i = 0; i < numPerson; i++) {
            String name = scanner.next();
            String phoneNo = scanner.next();
            phoneBook.put(name, phoneNo);
        }
        for (int i = 0; i < numPerson; i++) {
            String curName = scanner.next();
            if (phoneBook.containsKey(curName))
                System.out.println(curName + "=" + phoneBook.get(curName));
            else
                System.out.println("Not found");
        }
    }
}
