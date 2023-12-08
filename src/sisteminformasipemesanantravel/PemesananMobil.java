/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisteminformasipemesanantravel;

/**
 *
 * @author WINDOWS 11
 */
public class PemesananMobil extends Destinasi {
    
    int lamaPerjalanan;
    
    int hitungBiaya() {
        return hargaDestinasi* lamaPerjalanan; 
    }

    public int getLamaPerjalanan() {
        return lamaPerjalanan;
    }

    public void setLamaPerjalanan(int lamaPerjalanan) {
        this.lamaPerjalanan = lamaPerjalanan;
    }

    
}
