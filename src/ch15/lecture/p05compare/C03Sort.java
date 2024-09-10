package ch15.lecture.p05compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03Sort {
    public static void main(String[] args) {
        List<Book3> list = new ArrayList<>();
        list.add(new Book3("java", 300));
        list.add(new Book3("git", 400));
        list.add(new Book3("css", 500));
        list.add(new Book3("spring", 200));

        list.forEach(System.out::println);
        Collections.sort(list, (x, y) -> x.getPrice() - y.getPrice());

        System.out.println("--가격순 정렬 --");
        list.forEach(System.out::println);

        Collections.sort(list, (x, y) -> y.getPrice() - x.getPrice());
        System.out.println("--가격 역순 정렬 --");
        list.forEach(System.out::println);

        Collections.sort(list, (x, y) -> x.getTitle().compareTo(y.getTitle()));
        System.out.println("--제목 순 정렬 --");
        list.forEach(System.out::println);

        Collections.sort(list, (x, y) -> -x.getTitle().compareTo(y.getTitle()));
        System.out.println("--제목 역순 정렬 --");
        list.forEach(System.out::println);

    }
}

class Book3 {
    private String title;
    private int price;

    // 생성자, getter, setter, toString
    public Book3(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book3{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
