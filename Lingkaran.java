
/**
 *
 * @author mshaf
 */
public class Lingkaran {
    double phi=3.14;
    double r;
    
    public double luasLingkaran(){
        double total = phi*r*r;
        return total;
    }
    public double kelilingLingkaran(){
        double total = 2*phi*r;
        return total;
    }
    public static void main(String[] args) {
        Lingkaran lk1 = new Lingkaran();
        lk1.r = 5;
        System.out.println("luas dari lingkaran adalah = " + lk1.luasLingkaran());
        System.out.println("keliling dari lingkaran adalah = " +lk1.kelilingLingkaran());
    }
}
