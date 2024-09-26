package jobsheet2;
public class TestPinjam {
    public static void main(String[] args) {
        Pinjam pj1 = new Pinjam();       
        Pinjam pj2 = new Pinjam(); 
        pj1.id=12345;
        pj1.namaMember="Irham";
        pj1.namaGame="HarvestMoon";
        pj1.harga=50000;
        pj1.tampilBiodata();
        pj1.sewa(6);
        System.out.println();
        
        pj2.id=94059;
        pj2.namaMember="Izza";
        pj2.namaGame="Godzila";
        pj2.harga=20000;
        pj2.tampilBiodata();
        pj2.sewa(4);
    }
}
