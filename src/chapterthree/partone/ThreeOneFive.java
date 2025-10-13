package chapterthree.partone;

import java.util.Scanner;

class ThreeOneFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int x = a.length();
        int y = b.length();
        if (x > y) {
            System.out.println("Махатма");
        } else {
            System.out.println("Джавахарлал");
        }
    }
}