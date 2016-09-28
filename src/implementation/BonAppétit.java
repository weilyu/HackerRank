package implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by wei on 2016/09/28.
 * https://www.hackerrank.com/challenges/bon-appetit
 */
public class BonAppétit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //total items number
        int k = scanner.nextInt(); //number anna refused
        ArrayList<Integer> itemList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            itemList.add(scanner.nextInt());
        }
        itemList.remove(k); //get list of items they shared
        int chargeAnna = scanner.nextInt();

        //calculate how much anna should pay
        int billToSplit = 0;
        for (int i : itemList)
            billToSplit += i;
        int annaShouldPay = billToSplit / 2;
        if (chargeAnna == annaShouldPay)
            System.out.println("Bon Appetit");
        else
            System.out.println(chargeAnna - annaShouldPay);
    }
}
