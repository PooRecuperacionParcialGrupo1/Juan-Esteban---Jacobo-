/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Jacobo
 */
public class Furgoneta extends Vehiculo{
    
    private double volumenLitros;

    public Furgoneta(double volumenLitros, String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.volumenLitros = volumenLitros;
    }

    public double getVolumenLitros() {
        return volumenLitros;
    }
    
    @Override
    double calcularAutonomia() {
        return 500 + volumenLitros;
    }
    
    @Override
    String mostrarInformacionGeneral(){
        return super.mostrarInformacionGeneral() + "Furgoneta{" + "volumenLitros=" + volumenLitros + '}';
    }
    
}