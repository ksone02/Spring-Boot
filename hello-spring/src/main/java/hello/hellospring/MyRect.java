package hello.hellospring;

import java.util.Scanner;

public class MyRect {

    static int w, h; // w = 가로, h = 세로

    public static void main(String[] args) {
        myInput();
    }

    public static void myInput() {
        Scanner scan = new Scanner(System.in);

        w = scan.nextInt();
        h = scan.nextInt();
        myPrint();
    }

    public static void myPrint() {
        System.out.println(getArea());
    }

    public static int getArea() {
        return w * h;
    }
}
