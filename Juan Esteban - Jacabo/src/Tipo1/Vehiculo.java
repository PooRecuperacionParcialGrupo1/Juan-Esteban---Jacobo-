/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Usuario
 */
public abstract class Vehiculo {
    String placa;
    String modelo;
    String marca;

    public Vehiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    abstract double calcularAutonomia();
    String mostrarInformacionGeneral(){
        return "Vehiculo{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + '}';
    }

}
