package Praktikum2;
import java.util.Scanner;
public class Barang1 {

    public int kodeBarang;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hargaJual;
public Scanner Oscar = new Scanner(System.in);
    public void hitungHargaJual() {
     
        System.out.println("Harga dasar : "+hargaDasar);
        Oscar.nextInt();
        System.out.println("Discount : "+diskon);
        Oscar.nextFloat();
        hargaJual = (int) ((int) hargaDasar-(diskon * hargaDasar));
        System.out.println("Harga Jual : ");
    }
    public void tampilData(){
        System.out.println("Kode Barang : "+kodeBarang);
       Oscar.nextInt();
        System.out.println("Nama Barang : "+namaBarang);
        Oscar.nextLine();
        System.out.println("Harga dasar : "+hargaDasar);
        Oscar.nextInt();
        System.out.println("Diskon : "+diskon);
        Oscar.nextInt();
        System.out.println("Harga jual : "+hargaJual);
        Oscar.nextInt();
    }
    public static void main(String[] args) {
        
    }
}
