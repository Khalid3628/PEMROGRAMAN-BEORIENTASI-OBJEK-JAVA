/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15soal1;

/**
 *
 * @author DELL
 */
import kalkulatorpack.Kalkulator;

public class Bab15Soal1 {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        int tambah = kalkulator.tambah(1, 3);
        System.out.println(tambah);
             
        int kurang = kalkulator.kurang(3, 2);
        System.out.println(kurang);
        
        int bagi = kalkulator.bagi(10, 2);
        System.out.println(bagi);
        
        int kali = kalkulator.kali(3, 4);
        System.out.println(kali);
    }
}
