package ch06.exercise.p18;

public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService입니다.");
        } else {
            System.out.println("다른 ShopService입니다.");
        }
    }
}

