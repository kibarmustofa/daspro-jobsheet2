package P11;
import java.util.Scanner;

public class star14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Masukan nilai N = ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
    }
}