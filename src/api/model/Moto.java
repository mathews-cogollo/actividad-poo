/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.model;

/**
 *
 * @author Mathews
 */
public class Moto extends Vehiculo{
 private int cilindraje;
   public Moto(String marca, String modelo, String placa, int maxvelocidad, int cilindraje) {
        super(marca, modelo,placa, maxvelocidad);
        this.cilindraje = cilindraje;
      
} 
 
 
 
 
 
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
   
}
