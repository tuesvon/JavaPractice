package chapterthree.parttwo;

import java.util.Scanner;

class ThreeTwoTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();


        if (d < 1 || m < 1 || m > 12 || y < 1){
            System.out.println(false);
        } else if (m == 2) {
            boolean isLeap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
            System.out.print(isLeap ? d <= 29 : d <= 28);
        } else if (m == 4 || m == 6 || m == 9 || m == 11){
            System.out.print(d <= 30);
        } else {
            System.out.print(d <= 31);
        }
    }
}