package chaptertwo.partfive;

import java.util.Scanner;

class TwoFiveFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = x / y;
        int b = x % y;
        System.out.println(a + " " + b);
    }
}