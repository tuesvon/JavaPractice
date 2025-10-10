package chaptertwo.partseven;

import java.util.Scanner;

class TwoSevenTwelve {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        String b = str.nextLine();
        String x = a + " " + b;
        int z = x.length();
        System.out.println(x);
        System.out.println(z);
    }
}