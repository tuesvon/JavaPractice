package chapterthree.partone;

import java.util.Scanner;

class ThreeOneNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 5 || a == 4 || a == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}