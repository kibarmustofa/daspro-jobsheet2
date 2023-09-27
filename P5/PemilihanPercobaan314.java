import java.util.Scanner;
public class PemilihanPercobaan314 {

    public static void main(String[] args) {
    double angka1, angka2, hasil;
    char operator;
    
    Scanner input14 = new Scanner(System.in);
    System.out.print("Masukan angka pertama: ");
    angka1 = input14.nextDouble();
    System.out.print("Masukan angka kedua:");
    angka2 = input14.nextDouble();
    System.out.print("Masukan operator (+ - * /):");
    operator = input14.next().charAt(0);

 switch (operator) {
    case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + "+" + angka2 + "=" + hasil);  
        //jadi hasil akan  terprint 2 kali dan berhenti di pernyataan selanjutnya 
        
    case '-':
        hasil = angka1 + angka2;
        System.out.println(angka1 + "-" + angka2 + "=" + hasil); 
        break;
    case '*':
        hasil = angka1 + angka2;
        System.out.println(angka1 + "*" + angka2 + "=" + hasil); 
        break;
    case '/':
        hasil = angka1 + angka2;
        System.out.println(angka1 + "/" + angka2 + "=" + hasil); 
        break;
    default:

        }
    }
}
