package Persewaan;

public class TestPersewaan {
    public static void main(String[] args) {
        Persewaan ps1 = new Persewaan();
        
        ps1.id = 29;
        ps1.namaMember = "DIKKY ANDISA TRIPAMUNGKAS";
        ps1.namaGame = "PES 2020";
        ps1.harga = 7000;
        ps1.tampilPeminjaman();
        
        System.out.println("Total Harga\t: " + ps1.hitungSewa(3));
    }
}
