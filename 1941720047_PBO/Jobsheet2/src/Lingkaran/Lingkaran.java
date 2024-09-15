/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    public double phi;
    public double r;
    public double hitungLuas(){
       double luas;
       luas=phi*r*r;
       return luas;
    }
    public double hitungKeliling(){
        double keliling;
        keliling=2*phi*r;
        return keliling;
    } 
}
