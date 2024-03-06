/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.model;

/**
 *
 * @author Mathews
 */
public class Vehiculo {
   private String marca; 
    private String placa; 
    private String modelo;
    private int maxvelocidad;
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the maxvelocidad
     */
    public int getMaxvelocidad() {
        return maxvelocidad;
    }

    /**
     * @param maxvelocidad the maxvelocidad to set
     */
    public void setMaxvelocidad(int maxvelocidad) {
        this.maxvelocidad = maxvelocidad;
    }
 
}
