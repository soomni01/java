package ch06.lecture.p09encapsulation;

public class C02GetterSetter {
}


// 필드는 특별한 이유가 없다면 private 으로
// 필드값 변경(setter)/읽기(getter) 메소드를 public 으로 작성

class MyClass02 {
    private int age;
    private String name;
    private String email;
    private String address;
    private boolean married;
    private boolean enabled;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}