/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package Tugas4;

    /**
     *
     * @author Risky
     */
    public class BarangTest {
        public static void main(String[] args) {
            Barang br = new Barang();

            br.kode="Elektronik";
            br.namaBarang="Handphone";
            br.hargaDasar=3000000;
            br.diskon=0.25f;
            br.tampilData();
        }
    }
