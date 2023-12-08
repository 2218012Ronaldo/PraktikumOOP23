/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisteminformasipemesanantravel;

/**
 *
 * @author WINDOWS 11
 */
public class enkapulapsitravel {
        private String kode_boking;
    public double durasi,harga;
    double total;
    
 
    public String getkode_boking() {
        return kode_boking;
    }
    public void setkode_boking(String kode_hp) {
        this.kode_boking= kode_boking;
    }

    double totaltravel() {
        total = (harga * durasi);
        return total;
    }

}
