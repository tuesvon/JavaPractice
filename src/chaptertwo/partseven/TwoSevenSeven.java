package chaptertwo.partseven;

import java.util.Scanner;

class TwoSevenSeven {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        int x = a.length();
        char y = a.charAt(0);
        char z = a.charAt(x - 1);
        System.out.println(y + " " + z);
    }
}