public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("_______________Char & String");
        char isChar = 'a';
        String iString = "Wow";
        System.out.println("char = " + isChar + "\nstring = " + iString);

        System.out.println("________________Boolean");
        boolean t = true;
        boolean f = false;
        System.out.println("T = " + t + "\nF  = " + f);
        System.out.println("__________________Var and Final");
        Byte isByte = 120;
        var isVar = 121;
        var isVarStr = "Uyey";
        System.out.println("Byte = " + isByte + " Var = " + isVar + " Varstring = " + isVarStr);

        final var isFinal = 15;
        System.out.println("Final = " + isFinal);

        System.out.println("___________________________Assignment Operator");
        // +=
        // -=
        // *=
        // /=
        // %=

        var G = 4;
        G+=2;
        System.out.println("G = " + G );

        System.out.println("_____________________Unary Operator");
        byte abc = 12;
        System.out.println("abc-12 = " + -abc);
        System.out.println("abc-12 = " + +abc);

        // Decrement (+)= Post & Pre 
        byte isDec = 10;
        // Pre - Decrement
        System.out.printf("Pre-Decrement = %d", ++isDec);

        // post - Decrement
        byte isPost = 20;
        System.out.printf("\n1pre-Decrement : %d ", isPost++);
        System.out.printf("\n2pre-Decrement : %d ", isPost);

        // increment (-) = post & pre 
        System.out.printf("\n\nPre-Decrement = %d", --isDec);
        System.out.printf("\n1pre-Decrement : %d ", isPost--);
        System.out.printf("\n2pre-Decrement : %d ", isPost);

        System.out.println("__________________Operator Perbandingan");
        // >
        // <
        // >=
        // <=
        // ==
        // !=

        System.out.println("__________________Operator Logika");
        // and &&
        // or |
        // xor ^
        // not !

        System.out.println("T and T " + (true && true));
        System.out.println("T or F " + (true | true));
        System.out.println("T xor T " + (true ^ true));
        System.out.println("not T " + ( ! true));
    }
}
