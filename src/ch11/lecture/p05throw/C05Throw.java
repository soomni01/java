package ch11.lecture.p05throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05Throw {
    public static void main(String[] args) throws Exception {
        Class.forName("");
    }

    public static void action() throws ClassNotFoundException, FileNotFoundException {
        Class.forName("");

        var io = new FileInputStream("");
    }

    public static void action2() throws Exception {
        Class.forName("");
        new FileInputStream("");
    }
}