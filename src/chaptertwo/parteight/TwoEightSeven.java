package chaptertwo.parteight;

import java.util.Scanner;

class TwoEightSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double x1 = (-1 * b) / a;
        double x2 = c / a;
        System.out.print(x1 + " " + x2);
    }
}