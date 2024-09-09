package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C04Equals {
    public static void main(String[] args) {
        Set<Book4> set = new HashSet<>();
        boolean b1 = set.add(new Book4("java", "shin"));
        boolean b2 = set.add(new Book4("git", "linus"));
        boolean b3 = set.add(new Book4("java", "shin"));

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        int size = set.size();
        System.out.println("size = " + size);

    }
}

class Book4 {
    private String title;
    private String author;

    public Book4(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book4 book4 = (Book4) o;
        return Objects.equals(title, book4.title) && Objects.equals(author, book4.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
