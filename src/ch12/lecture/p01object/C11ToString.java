package ch12.lecture.p01object;

public class C11ToString {
}

class MyClass11 {
    private String name;
    private String email;
    private String address;

    @Override
    public String toString() {
        return "MyClass11{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
