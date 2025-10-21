package chapterfour.partone;

import java.util.Scanner;

class FourOneEight {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = 0;

        while (sc.hasNext()) {
            String a = sc.next();
            z++;
        }
        System.out.print(z);
    }
}