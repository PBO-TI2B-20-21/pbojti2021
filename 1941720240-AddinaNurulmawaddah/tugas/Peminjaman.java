package tugas;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    
    public void dataHasil(){
        System.out.println("Id         :"+id);
        System.out.println("Member     :"+namaMember);
        System.out.println("Nama Game  :"+namaGame);
        System.out.println("Harga Game :"+harga);
    }
    
    public int hargaBayar(int lama){
        int lamaMain = lama *harga;
        return lamaMain;
    }
    
    public static void main(String[] args) {
        Peminjaman pinjam = new Peminjaman();
        pinjam.id = 11;
        pinjam.namaMember = "Addina";
        pinjam.namaGame = "Chess Rush";
        pinjam.harga = 25000;
        pinjam.dataHasil();
        System.out.println("Total Harga : "+pinjam.hargaBayar(10));
    }
}

