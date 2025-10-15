package chapterthree.parttwo;

import java.util.Scanner;

class ThreeTwoEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b + c) % 2 != 0 && (a * b * c) % 2 == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}