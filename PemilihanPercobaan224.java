import java.util.Scanner;
public class PemilihanPercobaan224 {
    public static void main (String [] args){
    Scanner input24 = new Scanner(System.in);

    System.out.print("Nilai uas     : ");
    float uas = input24.nextFloat();
    System.out.print("Nilai uts     : ");
    float uts = input24.nextFloat();
    System.out.print("Nilai kuis    : ");
    float kuis = input24.nextFloat();
    System.out.print("Nilai tugas   : ");
    float tugas = input24.nextFloat();
    
    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
    if (total > 80 && total <= 100 ){
        System.out.println("Nilai akhir = " + total + " kategori A (Sangat Baik)");
    }
    else if (total > 73 && total <= 80 ){
        System.out.println("Nilai akhir = " + total + "kategori B+ (Lebih Dari Baik)");
    }
    else if (total > 65 && total <= 73 ){
        System.out.println("Nilai akhir = " + total + "kategori B (Baik)");
    }
    else if (total > 60 && total <= 65 ){
        System.out.println("Nilai akhir = " + total + "kategori C+ (Lebih Dari Cukup)");
    }
    else if (total > 50 && total <= 60 ){
        System.out.println("Nilai akhir = " + total + "kategori C (Cukup)");
    }
    else if (total > 39 && total <= 50 ){
        System.out.println("Nilai akhir = " + total + "kategori D (Kurang)");
    }
    else if (total <= 39 ){
        System.out.println("Nilai akhir = " + total + "kategori E (Gagal)");
    }
    String message = total < 66 ? "Remidi " : "Tidak remidi";
    System.out.print("Nilai akhir = " + total + " sehingga " + message);
    input24.close();
    }
}