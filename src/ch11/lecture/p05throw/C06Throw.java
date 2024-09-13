package ch11.lecture.p05throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C06Throw {
    public static void main(String[] args) {
        action();
    }

    public static void action() {
        try {
            new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}