package ch11.lecture.p05throw;

import java.io.IOException;

public class C03Throw {
    public static void action1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void action2() throws ClassNotFoundException, IOException {
        boolean a = true;
        if (a) {
            throw new ClassNotFoundException();
        } else {
            throw new IOException();
        }
    }

    public static void main(String[] args) {
        try {
            action1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            action2();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}