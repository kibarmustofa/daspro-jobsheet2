import java.util.Scanner;
public class DoWhileCuti14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti:" );
        jatahCuti = sc.nextInt();
        
        do{
           System.out.print("Apakan anda ingin mengambil cuti (y/t)? ");
           konfirmasi = sc.next();
           
           if (konfirmasi.equalsIgnoreCase("y")) {
               System.out.print("jumlah hari: ");
               jumlahHari = sc.nextInt();

               if (jumlahHari <= jatahCuti) {
                   jatahCuti -= jumlahHari;
                   System.out.println("sisa jatah cuti: "+ jatahCuti );
                } else { 
                    System.out.println("sisa jatah cuti anda tidak mencukupi");
                  
                }
           }
        }while (jatahCuti > 0);
    }
}       