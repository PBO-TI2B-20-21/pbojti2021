package jobsheet2;
public class TestBarang {
    public static void main(String[] args) {
        BarangPercobaan brg1=new BarangPercobaan();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBaramg();
        //Menampilkan dan mengisi argumen untuk menambah stok barang
        System.out.println("Stok Baru adalah " +brg1.tambahStok(0));
    }
}
