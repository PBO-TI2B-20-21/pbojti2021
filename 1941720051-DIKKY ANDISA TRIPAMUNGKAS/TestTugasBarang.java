package TugasBarang;

public class TestTugasBarang {
    public static void main(String[] args) {
        TugasBarang br1 = new TugasBarang();
        
        br1.kode = "001PT";
        br1.namaBarang = "Sepatu";
        br1.hargaDasar = 75000;
        br1.diskon = 5;
        br1.tampilData();
        
        System.out.println();
        TugasBarang br2 = new TugasBarang();
        br2.kode = "002PT";
        br2.namaBarang = "Tas";
        br2.hargaDasar = 70000;
        br2.diskon = 3;
        br2.tampilData();
    }
}
