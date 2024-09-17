public class Lingkaran {
    public Double phi=3.14;
    public Double r;

    public double hitungLuas(double r) {
        double hasil;
        hasil= phi*r*r;
        System.out.println("Hasilnya: "+hasil);
        return hasil;
    }

    public double hitungkeliling(double r) {
        double hasil;
        hasil= 2*phi*r;
        System.out.println("Hasilnya: "+hasil);
        return hasil;

    }
}
