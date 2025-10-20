//На вход подаются координаты точки x, y.
// Определите, попадает ли точка в заштрихованную область.
// Выведите "Yes", если попадает, и "No" - в противном случае.
// Примечание. Считать, что граница принадлежит заштрихованной области.

package chapterthree.partfive;

import java.util.Scanner;

class ThreeFiveSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (y <= (2 - x * x) && (y >= x || y >= 0)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
