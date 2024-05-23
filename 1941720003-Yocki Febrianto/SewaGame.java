public class SewaGame {
    public int id, harga;
    public String namaMember, namaGame;

    public int hargaBayar(int hari){
        int hargaSewa = hari * harga;
        return hargaSewa;
    }

    public void tampil(){
        System.out.println("id\t\t\t\t: " + id);
        System.out.println("Nama Member\t\t\t: " + namaMember);
        System.out.println("Nama Game\t\t\t: " + namaGame);
        System.out.println("Harga Sewa Game Sehari\t\t: " + harga);
    }
}
