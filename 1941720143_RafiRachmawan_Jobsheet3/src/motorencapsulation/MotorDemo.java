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
public class MotorDemo {
    public static void main(String [] args){
       motor motorr = new motor();
       motorr.printStatus();
       motorr.tambahKecepatan();
       
       motorr.nyalakanMesin();
       motorr.printStatus();
       
       motorr.tambahKecepatan();
       motorr.printStatus();
       
       motorr.tambahKecepatan();
       motorr.printStatus();
       
       motorr.matikanMesin();
       motorr.printStatus();
    }
    
}
