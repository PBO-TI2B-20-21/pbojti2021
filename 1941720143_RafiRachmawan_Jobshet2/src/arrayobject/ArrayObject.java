/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobject;
import java.util.Scanner ;
/**
 *
 * @author Raffi
 */
public class ArrayObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        PersegiPanjang [] pparay = new PersegiPanjang [3];
    
 for (int i= 0; i<3; i++){
     pparay [0] = new PersegiPanjang();
     System.out.println("persegi panjang ke - " + i);
     System.out.println("masukan panjang : ");
     pparay[0].panjang =sc.nextInt();
     System.out.println("masukan lebar");
     pparay[0].lebar=sc.nextInt();
     
 }
 for ( int i =0 ; i<3 ; i++){
     System.out.println("persegi panjang ke -" + i);
     System.out.println("panjang :" + pparay[0].panjang + ", lebar " + pparay [0] . lebar);
 }
    
 //       System.out.println("pesegi panjang ke-0 , panjang " + pparay[0].panjang + ", lebar :" + pparay[0].lebar);
  //      System.out.println("pesegi panjang ke-1 , panjang " + pparay[1].panjang + ", lebar :" + pparay[1].lebar);
 //       System.out.println("pesegi panjang ke-2 , panjang " + pparay[2].panjang + ", lebar :" + pparay[2].lebar);
       }
}
