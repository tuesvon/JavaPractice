package chapterfour.partone;

import java.util.Scanner;

class FourOneFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while (sc.hasNext()) {
            int x = sc.nextInt();

            if (x < 0 || x > 10) {
                break;
            }
            a += x;
            b++;
        }

        if (b > 0 && b < 10) {
            double avg = (double) a / b;
            System.out.println(avg);
        }
    }
}