import java.util.Scanner;
public class PemilihanPercobaan215 {

public static void main(String[] args) {
  Scanner input15 = new Scanner(System.in);
 
  System.out.print("nilai uas      :");
  float uas = input15.nextFloat();
  System.out.print("nilai uts      :");
  float uts = input15.nextFloat();
  System.out.print("nilai kuis     :");
  float kuis = input15.nextFloat(); 
  System.out.print("nilai tugas    :");
  float tugas = input15.nextFloat(); 

  float nilai = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
  
  String message;

        if (nilai > 80 && nilai <= 100) {
            message = "Sangat Baik";
        } else if (nilai > 73 && nilai <= 80) {
            message = "Lebih dari Baik";
        } else if (nilai > 65 && nilai <= 73) {
            message = "Baik";
        } else if (nilai > 60 && nilai <= 65) {
            message = "Lebih dari cukup";
        } else if (nilai > 50 && nilai <= 60) {
            message = "cukup";
        } else if (nilai > 39 && nilai <= 50) {
            message = "kurang";
        } else {
            message = "gagal";
        }
  System.out.println("Nilai akhir = " + nilai + " Sehingga nilai " + message);

  }
}