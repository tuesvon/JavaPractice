package chaptertwo.partsix;

import java.util.Scanner;

class TwoSixTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = ((x + 1) / (y - 1)) + ((y + 1) / (x - 1));
        System.out.println(z);
    }
}
