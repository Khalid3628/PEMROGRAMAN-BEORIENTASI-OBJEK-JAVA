/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg9.soal.pkg2;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Bab9Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan awal : ");
        int nilaiAwal = myInput.nextInt();

        System.out.print("Masukkan bilangan akir : ");
        int nilaiAkhir = myInput.nextInt();
        
        System.out.print("Hasil deret bilangan : ");

        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.print(i);
            if (i + 5 <= nilaiAkhir) {
                System.out.print(", ");
            }
        }
    }
    
}
