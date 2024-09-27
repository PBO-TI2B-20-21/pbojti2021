package pbojs2;
import java.util.Scanner;
public class lingkaranMain {
    public static void main(String[] args) {
        Scanner hendra = new Scanner(System.in);
        Lingkaran l2 = new Lingkaran();
        int a,a2;
        do{
            menu();
            System.out.println("Pilih Hitung");
            a = hendra.nextInt();
            try{
                switch(a){
                    case 1:
                        System.out.print("Masukkan Jari-Jari Lingkaran : ");
                        int jari=hendra.nextInt();
                        System.out.print("Masukkan PHI : ");
                        double phi = hendra.nextDouble();
                        l2.Lingkaran(jari, phi);
                        System.out.println("Hasil : "+l2.luasHitung());
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Masukkan jari jari : ");
                        int jari2=hendra.nextInt();
                        System.out.print("Masukkan angka 2 : ");
                        int angka = hendra.nextInt();
                        System.out.print("Masukkan PHI : ");
                        double PHI = hendra.nextDouble();
                        l2.Lingkaran(jari2, PHI);
                        System.out.println("hasil : "+l2.kelilingHitung());
                        
                        System.out.println();
                        break;
                    case 3:
                        
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        while(a==1|a==2);
    }
    public static void menu(){
        System.out.println("PILIHAN MENU");
        System.out.println("1. Hitung luas");
        System.out.println("2. Hitung keliling");
        System.out.println("3.exit");
    }
}
