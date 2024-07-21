/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg5.soal.pkg1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Bab5Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("##Pendataan Karyawan PT.Cicak-cicak Didinding##");
        
        System.out.println("Masukan Nama Anda:");
        String Nama = myInput.nextLine();
        
        System.out.println("Masukkan Alamat Anda");
        String Alamat = myInput.nextLine();
        
        System.out.println("Masukan Usia Anda:");
        int Usia = myInput.nextInt();
        
        System.out.println("Masukan Gaji Anda:");
        double Gaji = myInput.nextDouble();
        
        
        System.out.println("-----------------------");
        System.out.println("Nama Karyawan: " + Nama);
        System.out.println("Alamat: " + Alamat);
        System.out.println("Usia: " + Usia + " tahun");
        System.out.println("Gaji: " + Gaji);
        System.out.println("-----------------------");

    }
    
}
