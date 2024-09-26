package Tugas;
public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pnjm = new Peminjaman();
        
        pnjm.id = 117;
        pnjm.namaMember = "Asep Las Karbit";
        pnjm.namaGame = "Forza Horizon 4";
        pnjm.harga = 10000;
        pnjm.durasi = 2;
        
        pnjm.tampilData();
    }
}
