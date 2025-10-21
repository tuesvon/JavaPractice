package chapterfour.partone;

import java.util.Scanner;

class FourOneThirteen {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int z = 0;

        while (sc.hasNext()) {
            int a = sc.nextInt();

            if (a % 11 != 0) {
                break;
            }
            x++;

            if (a % 3 == 0) {
                z += a;
            }
        }
        System.out.println(x);
        System.out.println(z);
    }
}
