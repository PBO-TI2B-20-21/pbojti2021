/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Risky
 */
public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas() {
        double luas;
        luas=phi*r*r;
        return luas;
    }
    public double keliling(){
        double keliling;
        keliling=2*phi*r;
        return keliling;
    }
}
