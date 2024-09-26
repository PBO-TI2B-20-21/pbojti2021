public class Lingkaran {
    
    public double phi,r;
    
    public double hitungLuas(){
        double hasil = phi * Math.pow(r, 2);
        return hasil;
    }
    
    public double hitungKeliling(){
        double  hasil = 2 * phi * r;
        return hasil;
    }
}
