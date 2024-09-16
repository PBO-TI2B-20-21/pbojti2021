
package Praktikum2;
import java.util.Scanner;
public class testPersewaan {
    public static void main(String[] args) {
    Scanner Oscar = new Scanner(System.in);
    Persewaan sewa1 = new  Persewaan();
        System.out.print(" ID : ");
        sewa1.ID =Oscar.nextLine();
        System.out.print("Nama member : " );
        sewa1.nama_member = Oscar.nextLine();
        System.out.print("Nama Games :");
        sewa1.nama_games = Oscar.nextLine();
        System.out.print("Harga perjam : ");
        sewa1.harga_perjam =Oscar.nextInt();
        System.out.print("waktu : ");
        sewa1.waktu = Oscar.nextInt();
        
       int total = sewa1.harga_perjam * sewa1.waktu ; 
        System.out.println("Harga total" + total);
        
    
    }
    
    
    
}
