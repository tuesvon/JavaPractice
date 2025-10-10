package chaptertwo.partseven;

import java.util.Scanner;

class TwoSevenFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char x = a.charAt(0);
        char y = b.charAt(0);
        boolean result = x < y;
        System.out.println(result);
    }
}