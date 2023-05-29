/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek03;

/**
 *
 * @author Lenovo
 */
public class SepedaAksi {
    public static void main (String[]args){
    Sepeda s = new Sepeda();
   s.setMerk("Butterfly");
   s.setWarna("Merah");
   s.setHarga(1000);
    
   
    s.cetakinfo();
    
    System.out.print("Merknya \t :");
    System.out.println(s.getMerk ());
    System.out.print("Warnanya \t :");
    System.out.println(s.getWarna ());
    System.out.print("Harganya \t :");
    System.out.println(s.getHarga ());
    
    
    
}
}