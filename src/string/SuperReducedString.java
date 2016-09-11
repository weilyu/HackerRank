package string;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/11/16.
 * Shil has a string, , consisting of  lowercase English letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "" would become either "" or "" after  operation.
 * <p>
 * Shil wants to reduce  as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Shil out by finding and printing 's non-reducible form!
 * <p>
 * Note: If the final string is empty, print Empty String .
 */
public class SuperReducedString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.nextLine());
        while (sb.length() >= 2) {
            boolean flag = true;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    flag = false;
                    sb.delete(i, i + 2);
                }
            }
            if (flag)
                break;
        }
        if (sb.length() > 0)
            System.out.println(sb.toString());
        else
            System.out.println("Empty String");
    }
}
