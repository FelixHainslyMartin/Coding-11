public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("________BITWISE : &");;
        var a = 27;
        var b = 18;
        System.out.println("NILAI A = " + a);
        System.out.println("Binary A = " + Integer.toBinaryString(a));
        System.out.println("NILAI B = " + b);
        System.out.println("Binary B = " + Integer.toBinaryString(b));
        System.out.println("NILAI ( a ^ b ) = " + (a ^ b));
        System.out.println("binary NILAI ( a ^ b ) = " + Integer.toBinaryString(a ^ b));
    }
}
