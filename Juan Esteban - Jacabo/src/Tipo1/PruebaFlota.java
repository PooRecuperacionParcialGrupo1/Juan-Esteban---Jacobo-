/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Jacobo
 */

import java.util.ArrayList;

public class PruebaFlota {
    public static void main(String[] args) {
        ArrayList<Camion> camiones = new ArrayList<>();
        ArrayList<Furgoneta> furgonetas = new ArrayList<>();
        Camion c1 = new Camion(10, "Bogotá", 250, "AAA111", "2020", "Volvo");
        if (!camiones.contains(c1)) {
            camiones.add(c1);
        }

        Camion c2 = new Camion(8, "Medellín", 420, "BBB222", "2019", "Scania");
        if (!camiones.contains(c2)) {
            camiones.add(c2);
        }

        Camion c3 = new Camion(12, "Cali", 300, "CCC333", "2021", "MAN");
        if (!camiones.contains(c3)) {
            camiones.add(c3);
        }

        Camion c4 = new Camion(6, "Barranquilla", 700, "DDD444", "2018", "Isuzu");
        if (!camiones.contains(c4)) {
            camiones.add(c4);
        }
        
        Furgoneta f1 = new Furgoneta(10, "BBB114", "2020", "Renault");
        if (!furgonetas.contains(f1)) {
            furgonetas.add(f1);
        }

        Furgoneta f2 = new Furgoneta(11, "BBB115", "2021", "Renault");
        if (!furgonetas.contains(f2)) {
            furgonetas.add(f2);
        }

        Furgoneta f3 = new Furgoneta(10, "BBB116", "2022", "Renault");
        if (!furgonetas.contains(f3)) {
            furgonetas.add(f3);
        }

        Furgoneta f4 = new Furgoneta(11, "BBB117", "2023", "Renault");
        if (!furgonetas.contains(f4)) {
            furgonetas.add(f4);
        }
        
        for (Camion c : camiones) {
            System.out.println(c.mostrarInformacionGeneral());
            System.out.println("Autonomia: " + c.calcularAutonomia());
        }
        
        for (Furgoneta f : furgonetas) {
            System.out.println(f.mostrarInformacionGeneral());
            System.out.println("Autonomia: " + f.calcularAutonomia());
        }
        
        for(Camion c : camiones) {
            c.asignarRuta();
            c.asignarRuta(c1.getAtrDestino());
            c.asignarRuta(c2.getAtrDestino(), c2.getAtrDistanciaKm());
            break;
        }
        
    }
}
