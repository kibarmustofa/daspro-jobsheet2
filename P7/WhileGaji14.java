import java.util.Scanner;
public class WhileGaji14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int jumlahKaryawan, jumlahJamLembur ;
        double gajiLembur, totalGajiLembur ;
        
        gajiLembur = 0 ;
        totalGajiLembur = 0 ;
    
        
        String jabatan;
        
        System.out.print("Masukan jumblah karyawan: ");
        jumlahKaryawan = scan.nextInt();
        
        int i = 0; // inisialisasi

        while (i < jumlahKaryawan ) { // kondisi berada di dalam while
            System.out.println("pilihan jabatan - direktur, Manajer, karyawan ke-" + (i+1) + ":" );
            jabatan = scan.next();
            System.out.print("Masukan jumblah jam lembur: ");

            jumlahJamLembur = scan.nextInt();
            i++ ; //update

            if (jabatan.equalsIgnoreCase("direktur")) {
               continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")){                
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid!");
                i--;
                continue;
                }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);

    }
}