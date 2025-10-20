package chapterthree.partfive;

import java.util.Scanner;

class ThreeFiveFour {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = Math.abs(sc.nextInt());
        int mid = (a % 100) / 10;

        if (a > 99 && a < 1000) {
            System.out.print(b == mid ? "true" : "false");
            System.out.print(b);
            System.out.print(mid);
        } else {
            System.out.print("error");
        }
    }
}
