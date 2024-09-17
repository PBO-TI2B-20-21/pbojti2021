import java.util.Scanner;
public class LingkaranMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Lingkaran li=new Lingkaran();

        System.out.println("pilih menu: ");
        System.out.println("1.Luas");
        System.out.println("2.Keliling");
        int pilih= sc.nextInt();
        if (pilih==1) {
            System.out.print("masukkan jari jari");
            double a=sc.nextDouble();
            li.hitungLuas(a); 
        } else if (pilih==2){
            System.out.print("masukkan jari jari");
            double a=sc.nextDouble();
            li.hitungkeliling(a);
        }
    }
}
