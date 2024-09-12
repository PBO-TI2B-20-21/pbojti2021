
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class TestLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lk = new Lingkaran();
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Jari-Jari : ");
        lk.r = in.nextDouble();
        double hitungLuas = lk.hitungLuas(lk.r);
        double hitungKeliling = lk.hitungKeliling(lk.r);

        System.out.println("Hasil:");
        System.out.println("Luas Lingkaran adalah " + hitungLuas);
        System.out.println("Keliling Lingkaran adalah " + hitungKeliling);
        System.out.println("============================================");
    }
    
}
