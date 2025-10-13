package chapterthree.partone;

import java.util.Scanner;

class ThreeOneSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("Access is granted");
        } else {
            System.out.println("Access is denied");
        }
    }
}