package ch06.lecture.p10singleton;

public class C01Singleton {
    public static void main(String[] args) {
//        Country c = new Country();
//        Country d = new Country();

        Country c = Country.getInstance();
        Country d = Country.getInstance();

        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}

class Country {
    private static Country s;

    private Country() {

    }

    public static Country getInstance() {
        if (s == null) {
            s = new Country();
        }
        return s;
    }
}
