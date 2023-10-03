import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaKm = 4000, biayaBrt = 5000;
        float jarakPengiriman, beratBarang, biayaPengiriman;

        System.out.println("Masukkan jarak (dalam km): ");
        jarakPengiriman = sc.nextFloat();

        System.out.println("Masukkan berat barang (dalam kg): ");
        beratBarang = sc.nextFloat();

        System.out.println("Pilih jenis layanan (reguler/ekspres): ");
        String jenisLayanan = sc.next();

        // Calculate the shipping cost
        biayaPengiriman = jarakPengiriman * biayaKm + beratBarang * biayaBrt;

        // Nested if statements to determine the shipping cost based on distance and weight
        if (jarakPengiriman <= 10) {
            if (beratBarang <= 5) {
                biayaPengiriman *= 0.8;  // 80% of the original cost for short distance and light weight
            }
        } else if (jarakPengiriman > 10 && jarakPengiriman <= 50) {
            if (beratBarang > 5) {
                biayaPengiriman *= 1.2;  // 120% of the original cost for medium distance and heavy weight
            }
        } else {
            biayaPengiriman *= 1.5;  // 150% of the original cost for long distance
        }

        // Compare regular and express shipping costs
        float biayaReguler = biayaPengiriman;
        float biayaEkspres = biayaPengiriman * 1.5;  // Assume express shipping costs 1.5 times more

        if (jenisLayanan.equals("reguler")) {
            System.out.println("Biaya pengiriman reguler adalah: " + biayaReguler);
        } else if (jenisLayanan.equals("ekspres")) {
            System.out.println("Biaya pengiriman ekspres adalah: " + biayaEkspres);
        } else {
            System.out.println("Jenis layanan tidak valid.");
        }
    }
}