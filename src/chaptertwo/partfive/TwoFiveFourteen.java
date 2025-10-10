package chaptertwo.partfive;

import java.util.Scanner;

class TwoFiveFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int x = z % 10;
        int myVar = Math.abs(x);
        System.out.print(myVar);
    }
}