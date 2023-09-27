import java.util.Scanner;

public class PemilihanPercobaan114 {

    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input14.nextInt();

        String AngkaBilanganBulat = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + angka + " adalah " + AngkaBilanganBulat );
    }
}
    