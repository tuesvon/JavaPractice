package chaptertwo.partfive;

import java.util.Scanner;

class TwoFiveEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = (5 * (x * x)) + (2 * x) + 11;
        System.out.println(y);
    }
}