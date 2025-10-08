package chaptertwo;

import java.util.Scanner;

class twofivesixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int h = x % 86400 / 3600;
        int m = x % 3600 / 60;
        int s = x % 3600 % 60;
        System.out.println (h/10 + "" + h%10 + ":" + m/10 + "" + m%10 + ":" + s/10 + "" + s%10);
    }
}