/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg8.soal.pkg1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Bab8Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Nilai awal ?: ");
        int nilaiAwal = myInput.nextInt();
        
        System.out.println("Nilai akhir ?: ");
        int nilaiAkhir = myInput.nextInt();
        
        System.out.println("Hasil nya : ");
        int j = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(j + ". " + i);
            j++;
        }
    }
    
}
