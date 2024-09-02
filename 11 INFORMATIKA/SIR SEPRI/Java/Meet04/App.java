// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("_BITWISE : &");
//         var a = 27;
//         var b = 18;
//         System.out.println("Nilai A = " + a);
//         System.out.println("Binary A = " + Integer.toBinaryString(a));
//         System.out.println("Nilai ~A = " + ~a);
//         System.out.println("Binary ~A = " + Integer.toBinaryString(~a));
//         System.out.println("Binary A = " + Integer.toHexString(a));
        
//         System.out.println("Nilai B = " + b);
//         System.out.println("Binary B= " + Integer.toBinaryString(b));
//         System.out.println("Nilai ~b = " + ~b);
//         System.out.println("Binary ~b = " + Integer.toBinaryString(~b));
//         System.out.println("Binary b = " + Integer.toHexString(b));

//         System.out.println("Nilai (A & B) = " + (a & b)); 
//         System.out.println("Binary (A & B) = " + Integer.toBinaryString(a & b)); 
//         System.out.println("Nilai (A | B) = " + (a | b)); 
//         System.out.println("Binary (A | B) = " + Integer.toBinaryString(a | b)); 
//         System.out.println("Nilai (A ^ B) = " + (a ^ b)); 
//         System.out.println("Binary (A ^ B) = " + Integer.toBinaryString(a ^ b)); 
//         System.out.println("Nilai a << 1 = " + (a << 1)); 
//         System.out.println("Binary (A << 1) = " + Integer.toBinaryString(a << 1)); 
//         System.out.println("Nilai a >> 1 = " + (a >> 1)); 
//         System.out.println("Binary (A >> 1) = " + Integer.toBinaryString(a >> 1)); 


//     }
// }

public class App {

    public static void main(String[]args){
        var nilai = 92;
        var present  = 90;
        String nilai_inf;
        System.out.println("_IF Statement");

        if(nilai >= 80 && present >= 85){
            if( (nilai>100) || (present > 100)){
                nilai_inf = "E";
            }
            else{
                nilai_inf = "A";
            }
        }
        else if(nilai >= 70 && present >= 75){
            nilai_inf ="B";
        }
        else if(nilai >= 60 && present >= 65){
            nilai_inf ="C";
        }
        else if(nilai >= 50 && present >= 55){
            nilai_inf ="D";
        }
        else {
            nilai_inf ="E";
        }

        System.out.println("Nilai informatika = " + nilai);
        System.out.println("Nilai informatika = " + present);
        System.out.println("Nilai informatika = " + nilai_inf);

        
        System.out.println("___________________ : Switch Statement  ");
        String status;
        switch (nilai_inf) {
            case "A":
                status = "Memilih jurusan yng tepat";
                break;
                case "B":
                status = "Memilih jurusan yang tepat2";
                break;
                case "C":
                    status = "Memilih jurusan yng tepat3";
                    break;
                case "D":
                    status = "Pindah jurusan UYEY";
                    break;
            default:
            status = "Pindah jurusan";
                break;
        }
        System.out.println("Status Belajar : " + status);
    }
}
// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("_BITWISE : &");
//         var a = 27;
//         var b = 18;
//         System.out.println("Nilai A = " + a);
//         System.out.println("Binary A = " + Integer.toBinaryString(a));
//         System.out.println("Nilai ~A = " + ~a);
//         System.out.println("Binary ~A = " + Integer.toBinaryString(~a));
//         System.out.println("Binary A = " + Integer.toHexString(a));
        
//         System.out.println("Nilai B = " + b);
//         System.out.println("Binary B= " + Integer.toBinaryString(b));
//         System.out.println("Nilai ~b = " + ~b);
//         System.out.println("Binary ~b = " + Integer.toBinaryString(~b));
//         System.out.println("Binary b = " + Integer.toHexString(b));

//         System.out.println("Nilai (A & B) = " + (a & b)); 
//         System.out.println("Binary (A & B) = " + Integer.toBinaryString(a & b)); 
//         System.out.println("Nilai (A | B) = " + (a | b)); 
//         System.out.println("Binary (A | B) = " + Integer.toBinaryString(a | b)); 
//         System.out.println("Nilai (A ^ B) = " + (a ^ b)); 
//         System.out.println("Binary (A ^ B) = " + Integer.toBinaryString(a ^ b)); 
//         System.out.println("Nilai a << 1 = " + (a << 1)); 
//         System.out.println("Binary (A << 1) = " + Integer.toBinaryString(a << 1)); 
//         System.out.println("Nilai a >> 1 = " + (a >> 1)); 
//         System.out.println("Binary (A >> 1) = " + Integer.toBinaryString(a >> 1)); 


//     }
// }

public class App {

    public static void main(String[]args){
        var nilai = 92;
        var present  = 90;
        String nilai_inf;
        System.out.println("_IF Statement");

        if(nilai >= 80 && present >= 85){
            if( (nilai>100) || (present > 100)){
                nilai_inf = "E";
            }
            else{
                nilai_inf = "A";
            }
        }
        else if(nilai >= 70 && present >= 75){
            nilai_inf ="B";
        }
        else if(nilai >= 60 && present >= 65){
            nilai_inf ="C";
        }
        else if(nilai >= 50 && present >= 55){
            nilai_inf ="D";
        }
        else {
            nilai_inf ="E";
        }

        System.out.println("Nilai informatika = " + nilai);
        System.out.println("Nilai informatika = " + present);
        System.out.println("Nilai informatika = " + nilai_inf);

        
        System.out.println("___________________ : Switch Statement  ");
        String status;
        switch (nilai_inf) {
            case "A":
                status = "Memilih jurusan yng tepat";
                break;
                case "B":
                status = "Memilih jurusan yang tepat2";
                break;
                case "C":
                    status = "Memilih jurusan yng tepat3";
                    break;
                case "D":
                    status = "Pindah jurusan UYEY";
                    break;
            default:
            status = "Pindah jurusan";
                break;
        }
        System.out.println("Status Belajar : " + status);
    }
}
