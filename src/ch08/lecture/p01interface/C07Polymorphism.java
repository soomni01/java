package ch08.lecture.p01interface;

public class C07Polymorphism {
    public static void main(String[] args) {
        String s = "java language";
        boolean b = s.contains("java");
        System.out.println("b = " + b);

        StringBuffer t = new StringBuffer();
        t.append("ja");
        t.append("va");


        boolean b1 = s.contains(t);

        System.out.println("b1 = " + b1);
    }
}
