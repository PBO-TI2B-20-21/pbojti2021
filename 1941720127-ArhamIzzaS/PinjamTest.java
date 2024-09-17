import java.util.Scanner;
public class PinjamTest {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pinjam pj=new Pinjam();
        pj.id=1;
        pj.nama="Arham";
        pj.member="Premium";
        pj.harga=10000;
        pj.namagame="Naruto";
        System.out.println("Berapa hari anda meminjam?");
        pj.lamasewa(sc.nextInt());
        pj.cekHarga();

    }
}
