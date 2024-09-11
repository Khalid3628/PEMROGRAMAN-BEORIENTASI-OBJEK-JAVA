/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab12soal1;

/**
 *
 * @author DELL
 */
public class Bab12Soal1 extends pegawai {
        int bonus=1000000;
        int gajiTotal = gaji + bonus + tunjanganMakan + transport;
    public static void main(String[] args) {
        Bab12Soal1 SA=new Bab12Soal1 ();
        System.out.println("Gaji System Analyst :"+SA.gaji);
        System.out.println("Bonus :"+SA.bonus);
        System.out.println("Tunjangan Makan :"+SA.tunjanganMakan);
        System.out.println("Transport :"+SA.transport);
        System.out.println("Gaji Total :"+SA.gajiTotal);
    }
}
