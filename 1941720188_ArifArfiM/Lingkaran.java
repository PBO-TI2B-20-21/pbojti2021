package com.company;

public class Lingkaran {
    public double phi;
    public double r;
    public double hitungLuas() {
        double luas;
        luas = phi * r * r;
        return luas;
    }
    public double hitungKeliling() {
        double keliling;
        keliling = 2 * phi * r;
        return keliling;
    }
}
