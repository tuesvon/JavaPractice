package chapterthree.partfive;

import java.util.Scanner;

class ThreeFiveThree {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.toLowerCase().contains(b.toLowerCase())) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}