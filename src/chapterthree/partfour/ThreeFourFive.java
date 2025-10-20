package chapterthree.partfour;

import java.util.Scanner;

class ThreeFourFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        switch (str) {

            case "System.out.println()":
                System.out.print("Это команда вывода на печать");
                break;

            case "if":
                System.out.print("Это условный оператор");
                break;

            case "else":
                System.out.print("Это альтернативная конструкция условного оператора");
                break;

            default:
                System.out.print("Раздел в разработке");
        }
    }
}