import java.util.Scanner;
public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.print("masukan nama: ");
            nama = sc.nextLine();
            System.out.print("masukan baris: ");
            baris = sc.nextInt();
            System.out.print("masukan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();
            penonton [baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine ();
            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
