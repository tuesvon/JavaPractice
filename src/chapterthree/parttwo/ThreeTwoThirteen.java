package chapterthree.parttwo;

import java.util.Scanner;

class ThreeTwoThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        char x = a.charAt(0);
        char y = b.charAt(0);
        char z = c.charAt(0);

        if ((x < y) && (x < z) && (y < z)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((x < y) && (x < z) && (z < y)) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if ((y < x) && (y < z) && (x < z)) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if ((y < x) && (y < z) && (z < x)) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((z < x) && (z < y) && (x < y)) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if ((z < x) && (z < y) && (y < x)) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}