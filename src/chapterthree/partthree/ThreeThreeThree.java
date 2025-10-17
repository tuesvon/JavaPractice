package chapterthree.partthree;

import java.util.Scanner;

class ThreeThreeThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (b > c) {
                System.out.print(b); // a > b > c
            } else if (a > c) {
                System.out.print(c); // a > c > b
            } else {
                System.out.print(a); // c > a > b
            }
        } else {
            if (a > c) {
                System.out.print(a); // b > a > c
            } else if (b > c) {
                System.out.print(c); // b > c > a
            } else {
                System.out.print(b); // c > b > a
            }
        }
    }
}