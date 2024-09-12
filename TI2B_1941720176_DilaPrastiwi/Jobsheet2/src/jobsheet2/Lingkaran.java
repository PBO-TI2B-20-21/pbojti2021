/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author WINDOWS 10
 */
public class Lingkaran {

    double phi = 3.14, r;

    double hitungLuas(double r) {
        double luas = phi * r * r;
        return luas;
    }

    double hitungKeliling(double r) {
        double keliling = phi * 2 * r;
        return keliling;
    }
}
