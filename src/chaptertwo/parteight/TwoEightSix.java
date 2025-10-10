package chaptertwo.parteight;

class TwoEightSix {
    public static void main(String[] args) {
        int x = 5, y = 3;
        int z = ++x; // z = 6; x = 6
        y += x--; // y = y + x => 3 + 6 => y = 9; x = 5
        z+= --x + y++; //==> x = 5 / y = 9 / z = 6 ==> 4 + 9 + 6
        System.out.println(x + y + z); //
    }
}
