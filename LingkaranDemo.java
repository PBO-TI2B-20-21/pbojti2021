public class LingkaranDemo {

    public static void main(String[] args) {
        Lingkaran lk = new Lingkaran();

        lk.phi = 3.14;
        lk.r = 14;

        System.out.println("Luas Lingkaran: " + lk.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lk.hitungKeliling());
    }

}
