package chaptertwo.partseven;

import java.util.Scanner;

class TwoSevenThirteen {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        int a = str.nextInt();
        int b = str.nextInt();
        int x = a + b;
        String y = Integer.toString(a);
        String z = Integer.toString(b);
        System.out.println(x);
        System.out.println(y + z);
    }
}