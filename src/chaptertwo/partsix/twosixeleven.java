package chaptertwo.partsix;

import java.util.Scanner;

class twosixeleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x++;
        int b = a--;
        System.out.println(a + " " +  b + " " + x);
    }
}
