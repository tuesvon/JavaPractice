package chapterthree.partfive;

import java.util.Scanner;

class ThreeFiveFive {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a < b) {
            System.out.print("<");
        } else if (a > b) {
            System.out.print(">");
        } else {
            System.out.print("=");
        }
    }
}
