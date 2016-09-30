package daysofcode30;

import java.util.Scanner;

/**
 * Created by edwinlyu on 9/30/16.
 */
public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();

    }
}

class MyBook extends Book {
    private int price;

    MyBook(String t, String a, int price) {
        super(t, a);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

abstract class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    abstract void display();


}
