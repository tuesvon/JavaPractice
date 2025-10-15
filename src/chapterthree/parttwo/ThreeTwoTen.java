package chapterthree.parttwo;

import java.util.Scanner;

class ThreeTwoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a + b) % 2 == 0 && (a * b) % 2 != 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}