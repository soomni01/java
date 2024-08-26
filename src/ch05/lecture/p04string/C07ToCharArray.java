package ch05.lecture.p04string;

public class C07ToCharArray {
    public static void main(String[] args) {
        // toCharArray : char 배열을 리턴
        String s = "java programming language";
        char[] arr = s.toCharArray();

        System.out.println(arr[0]); //j
        System.out.println(arr[1]); //a
        System.out.println(arr[arr.length - 1]); //8
    }
}
