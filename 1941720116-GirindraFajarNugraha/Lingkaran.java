package Tugas;
public class Lingkaran {
    public double phi, r;
    
    public double hitungLuas(){
        double luas;
        luas = phi*r*r;
        return luas;
    }
    public double hitungKeliling(){
        double keliling;
        keliling = 2*phi*r;
        return keliling;
    }
    public void tampilHasil(){
        System.out.println("Luas        = " + hitungLuas());
        System.out.println("Keliling    = " + hitungKeliling());
    }
}
