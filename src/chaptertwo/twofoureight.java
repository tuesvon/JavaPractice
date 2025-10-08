package chaptertwo;

import java.util.Scanner;

class Twofoureight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.next();
        String a = sc.next();
        System.out.println("Привет, " + x + ", это твой помощник " + y + ".");
        System.out.println("У тебя " + a + " новых писем.");
    }
}