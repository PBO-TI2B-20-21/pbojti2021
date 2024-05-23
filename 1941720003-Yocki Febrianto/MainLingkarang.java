import java.util.Scanner;
public class MainLingkarang {
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai jari-jari: ");
        ling.r = sc.nextDouble();

        ling.luasLingkaran();
        ling.kelilingLingkaran();
    }
}
