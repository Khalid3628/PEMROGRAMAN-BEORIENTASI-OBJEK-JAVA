/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab.pkg10.soal.pkg1;

/**
 *
 * @author DELL
 */
public class aritmatika3 {
    int angka;
    
    void setTambah(int bil1, int bil2) { 
        angka= bil1+bil2;
    }
    
    void setPengurangan(int bil1, int bil2) { 
        angka= bil1-bil2;
    }
    
    void setPerkalian(int bil1, int bil2) { 
        angka= bil1*bil2;
    }
    
    void setPembagian(int bil1, int bil2) { 
        angka= bil1/bil2;
    }
    
    void setPangkat(int bil1, int bil2) { 
        angka= bil1^bil2;
    }
    
    int getAngka() {
        return angka;
    }
}
