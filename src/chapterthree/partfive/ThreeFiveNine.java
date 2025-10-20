package chapterthree.partfive;

import java.util.Scanner;

class ThreeFiveNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int b = a.length();

        if (b > 5){
            System.out.print("Длинное слово");
        } else if (b == 5) {
            System.out.print("Пять букв");
        } else if (b == 4) {
            System.out.print("Четыре буквы");
        } else if (b == 3) {
            System.out.print("Три буквы");
        } else if (b == 2) {
            System.out.print("Две буквы");
        } else if (b == 1) {
            System.out.print("Одна буква");
        }
    }
}
