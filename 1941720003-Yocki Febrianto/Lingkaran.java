public class Lingkaran {
    public double phi = 3.14;
    public double r;

    public void luasLingkaran(){
        double luas = phi * (r*r);
        System.out.println("Luas lingkaran = " + luas);
    }

    public void kelilingLingkaran(){
        double keliling = 2 * phi * r;
        System.out.println("Keliling lingkaran = " + keliling);
    }
}
