package chapterfour.partone;

import java.util.Scanner;

class FourOneSeven {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = 0;

        while (m != 0) {
            n += m;
            m = sc.nextInt();
        }
        System.out.print(n);
    }
}
