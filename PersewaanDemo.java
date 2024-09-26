public class PersewaanDemo {
    
    public static void main(String[] args) {
        Persewaan gm1 = new Persewaan();
        Persewaan gm2 = new Persewaan();
        
        gm1.setId("C1277139");
        gm1.setNamaMember("Andrew");
        gm1.setNamaGame("The Sims");
        gm1.setHarga(10000, 2);
        gm1.tampilData();
        gm1.tampilHarga();
        System.out.println();
        gm2.setId("D6778712");
        gm2.setNamaMember("Megan");
        gm2.setNamaGame("Tekken 5");
        gm2.setHarga(100000, 8);
        gm2.tampilData();
        gm2.tampilHarga();
    
    }
}
