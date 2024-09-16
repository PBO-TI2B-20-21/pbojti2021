public class Lingkaran {
    double phi = 3.14;
    double r;

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
       System.out.println("Diketahui r : " + r);
       System.out.println("===================HASIL=================");
       System.out.println("Hasil dari luas lingkaran adalah " + hitungLuas());
       System.out.println("Hasil dari keliling lingkaran adalah " + hitungKeliling());
   }
}
