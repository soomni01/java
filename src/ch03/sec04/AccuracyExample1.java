package ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double piceUnit = 0.1;
        int number = 7;

        double result = apple - number * piceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}
