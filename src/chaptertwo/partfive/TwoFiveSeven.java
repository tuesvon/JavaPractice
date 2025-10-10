package chaptertwo.partfive;

import java.util.Scanner;

class TwoFiveSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double S = x * y;
        double P = (x + y) * 2;
        System.out.println(S);
        System.out.println(P);
    }
}