public class Bioskop14 {
    public static void main (String[] args) {
        String[][] penonton = new String[4][2]; // deklarasi ARRAY

        System.out.println(penonton.length);

        for (int i = 0; i < penonton.length; i++) {  // for loop
            System.out.println("Panjang baris ke-" + (i+1) + ":" + penonton[i].length);
        }
        penonton[0][0] = "Amin";  // input array
        penonton[0][1] = "Bena";
        penonton[1][0] = "candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";
   
        System.out.printf("%s \t %s \n", penonton[0][0],penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0],penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0],penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0],penonton[3][1]);
        // print tampilan dan memanggil array menggunakan print format
    }
}
