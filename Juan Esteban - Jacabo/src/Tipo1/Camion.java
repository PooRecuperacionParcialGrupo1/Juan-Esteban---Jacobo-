/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Jacobo
 */
public class Camion extends Vehiculo{
    
    double capacidadCargaToneladas;
    String atrDestino;
    double atrDistanciaKm;

    public Camion(double capacidadCargaToneladas, String atrDestino, double atrDistanciaKm, String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
        this.atrDestino = atrDestino;
        this.atrDistanciaKm = atrDistanciaKm;
    }

    @Override
    double calcularAutonomia() {
        return 500 - capacidadCargaToneladas;
    }
    
    public void asignarRuta(){
        System.out.println("Ruta estandar asignada. Sin destino especifico aun.");
    }
    
    public void asignarRuta(String atrDestino){
        System.out.println("Ruta asignada con destino a: " + atrDestino);
    }
    
    public void asignarRuta(String atrDestino, double atrDistanciaKm){
        System.out.println("Ruta asignada al " + atrDestino + ". Distancia total: " + atrDistanciaKm + " km. Preparando logística pesada.");
    }
}
