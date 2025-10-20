package chapterthree.partthree;

import java.util.Scanner;

class ThreeThreeSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean m = (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);

        if (m == false) {
            System.out.print("Чётных чисел нет");
        } else if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.print(Math.max(Math.max(a, b), c));
        } else if (a % 2 == 0 && b % 2 == 0) {
            System.out.print(Math.max(a, b));
        } else if (a % 2 == 0 && c % 2 == 0) {
            System.out.print(Math.max(a, c));
        } else if (b % 2 == 0 && c % 2 == 0) {
            System.out.print(Math.max(b, c));
        } else if (a % 2 == 0) {
            System.out.print(a);
        } else if (b % 2 == 0) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }
}