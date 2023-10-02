import java.util.Scanner;

public class PemilihanPercobaan124 {
    public static void main (String [] args){
    Scanner input24 = new Scanner(System.in);

    System.out.print("Masukkan angka: ");
    int angka = input24.nextInt();
    String hasil;
    hasil = (angka % 2 == 0) ? " Bilangan genap" : " Bilangan ganjil";
    System.out.println("Angka " + angka + hasil );
    input24.close();
    }
}