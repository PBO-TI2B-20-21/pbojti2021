package Tugas;

/**
 *
 * @author Aulafz
 */
public class Peminjaman {

    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;

    public void tampilData() {
        System.out.println("ID Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + harga);
    }

    public int bayar(int lamaSewa) {
        int total = lamaSewa * harga;
        return total;
    }
}
