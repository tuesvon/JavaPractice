package chapterthree.partthree;

import java.util.Scanner;

class ThreeThreeFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int z = sc.nextInt();
        if (Math.max(Math.max(a, b),c) - Math.min(Math.min(a, b), c) > z) {
            System.out.print("Ура, бастуем!");
        } else {
            System.out.print("За работу, Солнце ещё высоко");
        }
    }
}