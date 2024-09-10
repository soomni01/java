package ch15.lecture.p05compare;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02Sort {
    public static void main(String[] args) {
        List<Book2> books = new ArrayList<>();
        books.add(new Book2("java", 500));
        books.add(new Book2("git", 600));
        books.add(new Book2("react", 300));
        books.add(new Book2("spring", 700));
        books.add(new Book2("vue", 400));

        books.forEach((System.out::println));

        Collections.sort(books);
        System.out.println("-정렬후");
        books.forEach(System.out::println);
    }
}

class Book2 implements Comparable<Book2> {
    private String title;
    private int price;

    // 생성자, getter, setter, toString

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book2(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(@NotNull Book2 o) {
        // 음수 : 이 객체가 작으면

        // 0 : 두 객체가 같으면

        // 양수 : 이 객체가 크면

        return this.price - o.price;
    }
}
