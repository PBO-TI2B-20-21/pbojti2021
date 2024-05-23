public class TestBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();

        brg.namaBrg = "pensil";
        brg.jenisBrg = "ATK";
        brg.stok = 10;
        brg.tampilBarang();
        System.out.println("Stok baru adalah " + brg.tambahStok(20));
    }
}
