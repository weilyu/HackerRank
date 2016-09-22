package implementation;

import java.util.Scanner;

/**
 * Created by wei on 2016/09/22.
 * https://www.hackerrank.com/challenges/repeated-string
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        int numOfA = countA(s, s.length()); //s字符串中a的个数
        long total1 = n / s.length() * numOfA; //可整除部分a的个数
        long total2 = countA(s, (int) (n % s.length()));//剩余部分a的个数
        System.out.println(total1 + total2);
    }

    /**
     * 按长度截取字符串并计算a的个数
     * @param s 输入字符串
     * @param length 截取长度
     * @return a的个数
     */
    public static int countA(String s, int length) {
        int output = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a')
                output++;
        }
        return output;
    }


}
