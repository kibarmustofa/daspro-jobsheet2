import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double TotalLulus = 0;
        double TotalTidakLulus = 0;     //inisialisasi
        int lulus = 0;
        int TidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){ // kondisi 1 
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++){ //kondisi 2 
            if (nilaiMhs[i] > 70) {
                TotalLulus += nilaiMhs[i];
                lulus++;
            } else {
                TotalTidakLulus += nilaiMhs[i];
                TidakLulus++;
            }
        }
        //operasi aritatika
        double rata2Lulus = (lulus > 0) ? TotalLulus / lulus : 0;
        double rata2TidakLulus = (TidakLulus > 0) ? TotalTidakLulus / TidakLulus : 0;
        //tampilan 
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2TidakLulus);
    }
}