/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek03;

/**
 *
 * @author Lenovo
 */
public class Sepeda {
   private String merk;
   private String warna;
   private double harga;
    
    void cetakinfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                "Warna \t:"+warna+"\n"+
                "Harga \t+"+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
}
