package chapterfour.partone;

import java.util.Scanner;

class FourOneSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (n >= x * x) {
            System.out.print((x * x) + " ");
            x++;
        }
    }
}
