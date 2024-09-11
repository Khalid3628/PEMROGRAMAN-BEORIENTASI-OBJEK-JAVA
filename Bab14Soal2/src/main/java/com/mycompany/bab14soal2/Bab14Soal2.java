/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14soal2;

/**
 *
 * @author DELL
 */
public class Bab14Soal2 extends abstrakHewan{

    public void suara() {
        System.out.println("Suara Burung mencicit");
    }
    
    public static void main(String[] args) {
        abstrakHewan objek = new Bab14Soal2();
        objek.suara();
    }
}
