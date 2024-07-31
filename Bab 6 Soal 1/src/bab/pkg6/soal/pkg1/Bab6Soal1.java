/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg6.soal.pkg1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Bab6Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Masukan NIM:");
        String nim = myInput.nextLine();
        
        System.out.println("Masukan Nama:");
        String nama = myInput.nextLine();
        
        System.out.println("Masukan Nilai:");
        int nilai = myInput.nextInt();
        
        String grade;
        if (nilai < 50) {
            grade = "Tidak lulus";}
        else if (nilai >= 50 && nilai < 60) {
            grade = "D";} 
        else if (nilai >= 60 && nilai < 70) {
            grade = "C";}
        else if (nilai >= 70 && nilai < 80) {
            grade = "B";}
        else if (nilai >= 80 && nilai < 90) {
            grade = "A";}
        else if (nilai >= 90 && nilai < 100) {
            grade = "A+";}
        else {
            grade = "Data nilai salah";
        }
        
        System.out.println("-----------------------");
        System.out.println("Grade: " + grade);
    }
    
}
