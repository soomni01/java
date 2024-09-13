package ch11.lecture.p03catch;

public class C02Catch {
    public static void main(String[] args) {
        try {
            // ...
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            // ...
        } catch (ArithmeticException | IndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        try {
            // ArithmeticException
            // IndexOutOfBoundsException
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        try {
            // ArithmeticException
            // IndexOutOfBoundsException
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // ArithmeticException
            // IndexOutOfBoundsException
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
