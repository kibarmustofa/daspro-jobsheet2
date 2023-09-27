import java.util.Scanner;

public class PemilihanPercobaan114 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input00.nextInt();

        String AngkaBilanganBulat = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + angka + " adalah " + AngkaBilanganBulat );
    }
}
    