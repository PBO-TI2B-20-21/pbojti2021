package Lingkaran;
public class Lingkaran {
    public double phi = 3.14;
    public double r;
    
    public double hitungLuas() {
        return phi * r * r;
    }
    
    public double hitungKeliling() {
         return phi * (2 * r);
    }
}
