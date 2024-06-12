package Persewaan;

public class Persewaan {
    public int id, harga, total;
    public String namaMember, namaGame;
    
    public void tampilPeminjaman() {
        System.out.println("ID\t\t: " + id);
        System.out.println("Nama Member\t: " + namaMember);
        System.out.println("Nama Game\t: " + namaGame);
        System.out.println("Harga Sewa\t: " + harga + "/jam");
    }
    
    public int hitungSewa(int waktuSewa) {
        int sewa = waktuSewa * harga;
        return sewa;
    }
}
