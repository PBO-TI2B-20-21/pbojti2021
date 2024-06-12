package Lingkaran;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        
        l1.r = 7;
        System.out.println("Luas\t\t: "+ l1.hitungLuas());
        System.out.println("Keliling\t: " + l1.hitungKeliling());
    }
}
