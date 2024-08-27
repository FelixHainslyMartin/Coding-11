public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello, World! \n"); // (\n pengganti enter)
        System.out.print("Hello, World! \n");
        System.out.print("Hello, World!");
        System.out.println("\nNilai Pi : " + 3.14);
        System.out.printf("nilai pi : " + 3.14 * 2);
        System.out.printf("\nnilai a %d + %f", 10, 11.1);

        // Tipe data integer dan floating
        System.out.println(" -__________ Tipe data Integer & Floating");
        byte isByte = 10;
        short isShord = 10;
        long isLong = 10;
        int isInt = 10;
        double isDouble = 10;

        System.out.println("\n------Byte-------");
        System.out.println("Max : " + Byte.MAX_VALUE);
        System.out.println("Min : " + Byte.MIN_VALUE);
        System.out.println("Bytes : " + Byte.BYTES);
        System.out.println("Size : " + Byte.SIZE);

        System.out.println("\n------Short-------");
        System.out.println("\nMax : " + Short.MAX_VALUE);
        System.out.println("Min : " + Short.MIN_VALUE);
        System.out.println("Bytes : " + Short.BYTES);
        System.out.println("Size : " + Short.SIZE);

        System.out.println("\n------Long-------");
        System.out.println("\nMax : " + Long.MAX_VALUE);
        System.out.println("Min : " + Long.MIN_VALUE);
        System.out.println("Bytes : " + Long.BYTES);
        System.out.println("Size : " + Long.SIZE);

        System.out.println("\n------Integer-------");
        System.out.println("\nMax : " + Integer.MAX_VALUE);
        System.out.println("Min : " + Integer.MIN_VALUE);
        System.out.println("Bytes : " + Integer.BYTES);
        System.out.println("Size : " + Integer.SIZE);

        System.out.println("\n------Double-------");
        System.out.println("\nMax : " + Double.MAX_VALUE);
        System.out.println("Min : " + Double.MIN_VALUE);
        System.out.println("Bytes : " + Double.BYTES);
        System.out.println("Size : " + Double.SIZE);

        double r, pi, keliling, Luas;
        r = 40;
        pi = 3.14;
        keliling = 2 * pi * r;
        Luas = (pi * r * r);

        System.out.printf("Luas lingkaran adalah " + Luas + " dan keliling adalah " + keliling
                + " jika panjang jari jari nya " + r + " cm");


    System.out.println("________________");
    byte a = 11;
    int b = 2;

    short newA = a;
    System.out.println(a/b);
    }
}
