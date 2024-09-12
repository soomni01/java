package ch17.lecture.p03intermediate;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class C07Sorted {
    public static void main(String[] args) {
        List<Book> list = List.of(
                new Book("java", 500),
                new Book("git", 300),
                new Book("css", 700),
                new Book("spring", 600),
                new Book("react", 400)
        );
        System.out.println("-가격순-");
        list.stream()
                .sorted((b1, b2) -> b1.getPrice() - b2.getPrice())
                .forEach(System.out::println);
        System.out.println("-가격순-");
        list.stream()
                .sorted(Comparator.comparingInt(Book::getPrice))
                .forEach(System.out::println);

        System.out.println("-제목순-");
        list.stream()
                .sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()))
                .forEach(System.out::println);
        list.stream()
                .sorted(comparing(Book::getTitle))
                .forEach(System.out::println);
    }
}

class Book {
    private String title;
    private int price;

    // 생성자, getter, toString

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
