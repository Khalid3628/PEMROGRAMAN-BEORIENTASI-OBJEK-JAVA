/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal1;

/**
 *
 * @author DELL
 */
public class Bab13Soal1 {

    public static void main(String[] args) {
        Kalkulator objek = new Kalkulator();
        System.out.println("Hasil Pertambahan : " + objek.Tambah(20, 10));
        System.out.println("Hasil Pengurangan : " + objek.Kurang(20, 10));
        System.out.println("Hasil Perkalian   : " + objek.Kali(20, 10));
        System.out.println("Hasil Pembagian   : " + objek.Bagi(20, 10));
    }
}
