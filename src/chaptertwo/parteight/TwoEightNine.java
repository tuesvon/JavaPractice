package chaptertwo.parteight;

import java.util.Scanner;

class TwoEightNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y ;
        int diff = x - y;
        System.out.println("Сложение: " + x + " + " + y + " = " + sum);
        System.out.print("Вычитание: " + x + " - " + y + " = " + diff);
    }
}