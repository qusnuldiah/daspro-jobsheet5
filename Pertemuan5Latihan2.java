import java.util.Scanner;
public class Pertemuan5Latihan2 {
    public static void main (String [] args){
    Scanner input24 = new Scanner(System.in);
    String username, password;
    username = "user";
    password = "2525";
    
    System.out.print("Username : ");
    username = input24.nextLine();
    System.out.print("Password : ");
    password = input24.nextLine();

    if (username.equals("user") && password.equals("2525")){
        System.out.println("Login Berhasil");
    }
    else {
        System.out.println("Username dan Password salah");
    }
    input24.close();
    }
}   