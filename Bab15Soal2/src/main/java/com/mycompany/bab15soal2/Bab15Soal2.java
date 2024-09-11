/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15soal2;

/**
 *
 * @author DELL
 */
import kalkulatorpack.*;

public class Bab15Soal2 {

    public static void main(String[] args) {
        KalkulatorTambah obj1 = new KalkulatorTambah();
        System.out.println(obj1.tambah(2,3));
        
        KalkulatorKurang obj2 = new KalkulatorKurang();
        System.out.println(obj2.kurang(3,2));
        
        KalkulatorKali obj3 = new KalkulatorKali();
        System.out.println(obj3.kali(3, 4));
        
        KalkulatorBagi obj4 = new KalkulatorBagi();
        System.out.println(obj4.bagi(20, 2));
    }
}
