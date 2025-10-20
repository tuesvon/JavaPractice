package chapterthree.partfive;

import java.util.Scanner;

class ThreeFiveTwo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 99 && a < 1000) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}