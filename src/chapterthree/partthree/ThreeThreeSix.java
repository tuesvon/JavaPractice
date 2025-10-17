package chapterthree.partthree;

import java.util.Scanner;

class ThreeThreeSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean x = (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);

        if (x == false) {
            System.out.print("Чётных чисел нет");
        } else {

        }
    }
}