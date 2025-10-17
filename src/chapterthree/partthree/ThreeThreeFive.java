package chapterthree.partthree;

import java.util.Scanner;

class ThreeThreeFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int first = Math.max(a, c);
        int second = Math.min(b, d);
        if (first > second) {
            System.out.print("Пересечения нет");
        } else if (first == second){
            System.out.print(first);
        } else {
            System.out.print(first + " " + second);
        }
    }
}