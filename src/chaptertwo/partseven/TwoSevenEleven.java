package chaptertwo.partseven;

import java.util.Scanner;

class TwoSevenEleven {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        String b = str.nextLine();
        boolean result = a.equals(b);
        System.out.println(result);
    }
}