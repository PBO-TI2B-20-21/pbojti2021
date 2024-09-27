package pbojs2;
import java.util.Scanner;
public class Barangmain {
    public static void main(String[] args) {
        Scanner hendra = new Scanner(System.in);
        Barang b1 = new Barang();
        System.out.print("Masukkan Kode barang : ");
        String code = hendra.next();
        System.out.print("Masukkan Nama Barang : ");
        String nama = hendra.next();
        System.out.print("Harga Dasar : ");
        int price = hendra.nextInt();
        System.out.print("Diskon : ");
        float disk = hendra.nextFloat();
        b1.Barang(nama, code, price, disk);
        b1.hitungharga();
        b1.tampil();
    }
}
