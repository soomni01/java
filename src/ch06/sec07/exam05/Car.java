package ch06.sec07.exam05;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxspeed;

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxspeed) {
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }
}
