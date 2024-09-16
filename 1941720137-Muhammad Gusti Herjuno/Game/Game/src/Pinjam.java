public class Pinjam {
    int idMbr;
    String namaMbr;
    String namaGame;
    int harga;
    int lamaSewa;

    public void tampilData(){
        System.out.println("------------PEMINJAMAN GAME---------------");
        System.out.println("Id member   :" + idMbr);
        System.out.println("Nama member :" + namaMbr);
        System.out.println("Nama game   :" + namaGame);
        System.out.println("Harga Pinjam:" + harga);
        System.out.println("Lama Sewa   :" +lamaSewa);
        System.out.println("Total Harga :" + totalHarga());
        System.out.println("--------------------------------------------");
    }

    public int totalHarga(){
        int total;
        total = lamaSewa*harga;
        return total;  
    }
}
