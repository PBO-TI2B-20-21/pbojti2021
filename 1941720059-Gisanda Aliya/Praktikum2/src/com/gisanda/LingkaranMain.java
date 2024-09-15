package com.gisanda;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lk = new Lingkaran();

        lk.phi = 3.14;
        lk.r = 14;

        System.out.println("Luas        :" + lk.hitungLuas());
        System.out.println("Keliling    :" + lk.hitungKeliling());
    }
}