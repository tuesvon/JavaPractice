package chapterthree;

import java.util.Scanner;

class ThreeOneTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a % 7 == 0) ? "YES" : "NO");
    }
}