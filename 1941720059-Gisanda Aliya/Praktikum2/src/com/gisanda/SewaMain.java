package com.gisanda;

public class SewaMain {
    public static void main(String[] args){
        Sewa game = new Sewa();

        game.id="88888";
        game.namaMember="Gisanda";
        game.namaGame="GTA";
        game.lamaSewa=3;
        game.harga=10000;
        game.hitungHargaSewa(3, 10000);
        game.tampilData();

    }
}