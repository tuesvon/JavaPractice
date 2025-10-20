package chapterthree.partfive;

import java.util.Scanner;

class ThreeFiveSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {

            case 12: case 2: case 1:
                System.out.print("Зима");
                break;

            case 3: case 4: case 5:
                System.out.print("Весна");
                break;

            case 6: case 7: case 8:
                System.out.print("Лето");
                break;

            case 9: case 10: case 11:
                System.out.print("Осень");
                break;

            default:
                System.out.print("error");
        }
    }
}