package chaptertwo.partsix;

class twosixseven {
    public static void main(String[] args) {
        int x = 1, y = 5, z = 0;
        --y; //4
        x = 4 + y++; //9
        z += x--; //z = z + x ->0 = 0 + 0
        x = y + z; //9+5=14
        System.out.print(++x);
    }
}
