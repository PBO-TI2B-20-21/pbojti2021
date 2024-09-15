package com.gisanda;

public class Lingkaran {
    public double phi, r;

    public double hitungLuas() {
        double hasil = phi * r * r;
        return hasil;
    }

    public double hitungKeliling() {
        double hasil = 2 * phi * r;
        return hasil;
    }
}