package chaptertwo.partseven;

import java.util.Scanner;

class TwoSevenTen {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        int b = str.nextInt();
        System.out.println(a.charAt(b - 1));
    }
}