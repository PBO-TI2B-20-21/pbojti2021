/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author Rafi Rachmawan
 */
public class motor {
   
    private int kecepatan = 0 ;
    private boolean kontak0n = false ;
    
    public void nyalakanMesin(){
       kontak0n = true ;}
    public void matikanMesin(){
        kontak0n = false ;
        kecepatan = 0 ;
        
    }
    public void tambahKecepatan(){
        if(kontak0n == true ){
            kecepatan += 5 ;
            
        }else {
            System.out.println("kecepatan tidak bisa bertambah karena Mesin off! \n");
            
        }
    }
    public void kurangiKecepatan(){
        if(kontak0n == true ){
            kecepatan -=5;
        }
        else{
            System.out.println("kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }
    public void printStatus(){
        if(kontak0n == true ){
            System.out.println("kontak on");
            
        }else {
            System.out.println("kontak off");
        }
        System.out.println("kecepatan " + kecepatan + "\n");
    }
    }



