package chapterfour.partone;

import java.util.Scanner;

class FourOneFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (n >= x) {
            System.out.println(x++);
        }
    }
}