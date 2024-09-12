package tugas;

public class Lingkaran {
    public double jari2; 
    public double phi=(double) 3.14;
    
    public void inputJari(){
        System.out.println("Jari-Jari     :"+jari2);
    }
    
    public double luasLingkaran(){
        double luasLingkaran = (double) phi*jari2*jari2;
        return luasLingkaran;
    }
    
    public double kelilingLingkaran(){
        double kelilingLingkaran = (double) 2*phi*jari2;
        return kelilingLingkaran;
    }
    
    public void tampilData(){
        System.out.println("Keliling Lingkaran     :"+kelilingLingkaran());
        System.out.println("Luas Lingkaran     :"+luasLingkaran());
    }

}
