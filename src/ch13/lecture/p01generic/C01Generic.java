package ch13.lecture.p01generic;

public class C01Generic {
    public static void main(String[] args) {
        StringContainer1 container1 = new StringContainer1();
        container1.setItem("java");
        String s = container1.getItem();
        System.out.println("s = " + s);

        IntegerContainer1 box = new IntegerContainer1();
        box.setItem(900);
        Integer i = box.getItem();
        System.out.println("i = " + i);
    }
}

class IntegerContainer1 {
    private Integer item;

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}

class StringContainer1 {
    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
