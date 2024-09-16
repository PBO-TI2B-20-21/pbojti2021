/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Zidan
 */
public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas(double phi, double r){
        return(phi*r*r);
    }
    
    public double hitungKeliling(double phi, double r){
        return(2*phi*r);
    }
}
