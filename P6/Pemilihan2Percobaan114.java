import java.util.Scanner; 

public class Pemilihan2Percobaan114 {
    public static void main (String[] args){
    int tahun;

    Scanner input14 = new Scanner(System.in);
    System.out.print("Masukan tahun: ");
    tahun = input14.nextInt();

    if ((tahun %4) == 0 ){
        if((tahun % 100) !=0)
        System.out.println("Tahun kabisat");
    } else 
    System.out.println("Bukan Tahun Kabisat");
    
 }
}