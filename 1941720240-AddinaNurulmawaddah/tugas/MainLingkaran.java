package tugas;
import java.util.Scanner;


public class MainLingkaran {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        int jari2 ;
        Lingkaran lkr = new Lingkaran();
        System.out.println("Input: " );
        lkr.jari2 = scInt.nextInt();
        
        System.out.println("Luas Lingkaran: "+lkr.luasLingkaran());
        System.out.println("Keliling Lingkaran: "+lkr.kelilingLingkaran());
    }
}
