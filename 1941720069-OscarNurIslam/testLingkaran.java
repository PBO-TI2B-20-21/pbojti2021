package Praktikum2;
import java.util.Scanner;
public class testLingkaran {
    public static void main(String[] args) {
    Scanner Oscar = new Scanner(System.in);
   Lingkaran lingkar1 = new Lingkaran();
        System.out.print("Masukkan r :");
       lingkar1.r=Oscar.nextInt();
        System.out.print("Masukkan phi : ");
        lingkar1.phi=Oscar.nextInt();
       
        double Luas = lingkar1.phi * lingkar1.r * lingkar1.r;
        System.out.println("Luas Lingkaran : "+Luas);
        double keliling =2 * lingkar1.phi *lingkar1.r;
        System.out.println("Keliling Lingkaran : "+keliling);
    }
       
}
