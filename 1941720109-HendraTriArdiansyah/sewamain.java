package pbojs2;
import java.util.Scanner;
public class sewamain {
    public static void main(String[] args) {
        Scanner hendra = new Scanner(System.in);
        sewaGame s1 = new sewaGame();
        System.out.print("ID : ");
        int iD = hendra.nextInt();
        System.out.print("Nama : ");
        String name = hendra.next();
        System.out.print("Nama Game : ");
        String game = hendra.next();
        System.out.print("Harga/hari : ");
        int harga = hendra.nextInt();
        System.out.print("Lama sewa : ");
        int durasi = hendra.nextInt();
        s1.sewaGame(iD, name, game);
        s1.harga(harga);
        s1.durasiSewa(durasi);
        s1.totalHarga();
        s1.tampil();
    }
}
