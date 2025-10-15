package chapterthree.parttwo;

import java.util.Scanner;

class ThreeTwoEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String l = sc.nextLine();
        if (str.contains(l) || str.length() > 20) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}