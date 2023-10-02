import java.util.Scanner;
public class Pertemuan5Latihan1 {
    public static void main (String [] args){
    Scanner input24 = new Scanner(System.in);

    System.out.print("Masukkan jarak pertarungan : ");
    int jarak = input24.nextInt();

    if (jarak <= 5){
        System.out.println("Menggunakan Melee Weapon untuk pertarungan jarak dekat");
    }
    else {
        System.out.println("Menggunakan Ranged Weapon untuk pertarungan jarak jauh");
    }
    input24.close();
    }
}   
