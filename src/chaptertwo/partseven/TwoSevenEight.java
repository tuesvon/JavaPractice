package chaptertwo.partseven;

import java.util.Scanner;

class TwoSevenEight {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String x = a.nextLine();
        String y = a.next();
        boolean result = x.contains(y);
        System.out.println(result);
    }
}