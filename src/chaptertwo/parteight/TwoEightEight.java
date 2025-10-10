package chaptertwo.parteight;

import java.util.Scanner;

class TwoEightEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int z = a / 400 - a / 100 + a / 4 ;
        System.out.print(z);
    }
}