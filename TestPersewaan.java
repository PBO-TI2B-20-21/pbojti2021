public class TestPersewaan {

    public static void main(String[] args) {
        Persewaan gm1 = new Persewaan();
        Persewaan gm2 = new Persewaan();

        gm1.setId("A154");
        gm1.setNamaMember("Nanda");
        gm1.setNamaGame("The Sims");
        gm1.setHarga(4000, 2);
        gm1.tampilData();
        gm1.tampilHarga();

        gm2.setId("B729");
        gm2.setNamaMember("Megan");
        gm2.setNamaGame("Tekken 5");
        gm2.setHarga(4000, 8);
        gm2.tampilData();
        gm2.tampilHarga();
    }

}
