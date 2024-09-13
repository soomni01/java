package ch11.lecture.p05throw;

import java.io.IOException;

public class C04Throw {
    public static void action1() throws IOException {
        throw new IOException();
    }

    public static void action2() throws IOException {
        action1();
    }

    public static void action3() throws IOException {
        action2();
    }

    public static void main(String[] args) throws IOException {
        action3();
    }

    public static void action4() {
        try {
            action3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}