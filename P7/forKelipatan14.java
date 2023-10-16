import java.util.Scanner ;
public class forKelipatan14 {
    public static void main(String[] args) { 
        Scanner scan  = new Scanner(System.in);

        int kelipatan,total,counter ;
        total = 0 ;
        counter = 0 ;

        System.out.print("masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++ ) {  //perulangan for
            if (i % kelipatan == 0){
                total += i;
                counter++;
            }   
        }    
        //rata-rata = hasil total / jumblah data 
        double rata = (double) total / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan, counter );
        System.out.printf("Total bilangan keipatan %d dari 1 sampai 50 persen adalah %d\n", kelipatan, total );
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rata); 
    }
}