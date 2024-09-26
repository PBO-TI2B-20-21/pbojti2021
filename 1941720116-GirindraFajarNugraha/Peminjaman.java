package Tugas;
public class Peminjaman {
    public int id, durasi, harga;
    public String namaMember, namaGame;
    
    public int hitungTotalHarga(){
        int totalHarga;
        totalHarga = durasi * harga;
        return totalHarga;
    }
    void tampilData(){
        System.out.println("ID          : " + id);
        System.out.println("Nama        : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + harga);
        System.out.println("Durasi(hari): " + durasi);
        System.out.println("------------------------------");
        System.out.println("Total Harga : " + hitungTotalHarga());
        System.out.println("------------------------------");
    }
}
