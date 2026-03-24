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
    
    public static boolean existeCamion(ArrayList<Camion> camiones, String placa) {
        for (Camion c : camiones) {
            if (c.placa.equals(placa)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean existeFurgoneta(ArrayList<Furgoneta> furgonetas, String placa) {
        for (Furgoneta f : furgonetas) {
            if (f.placa.equals(placa)) {
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        ArrayList<Camion> camiones = new ArrayList<>();
        ArrayList<Furgoneta> furgonetas = new ArrayList<>();
        Camion c1 = new Camion(10, "Bogotá", 250, "AAA111", "2020", "Volvo");
        if (!existeCamion(camiones, c1.placa)) {
            camiones.add(c1);
        }

        Camion c2 = new Camion(8, "Medellín", 420, "BBB222", "2019", "Scania");
        if (!existeCamion(camiones, c2.placa)) {
            camiones.add(c2);
        }

        Camion c3 = new Camion(12, "Cali", 300, "CCC333", "2021", "MAN");
        if (!existeCamion(camiones, c3.placa)) {
            camiones.add(c3);
        }

        Camion c4 = new Camion(6, "Barranquilla", 700, "DDD444", "2018", "Isuzu");
        if (!existeCamion(camiones, c4.placa)) {
            camiones.add(c4);
        }
        
        Furgoneta f1 = new Furgoneta(10, "BBB114", "2020", "Renault");
        if (!existeFurgoneta(furgonetas, f1.placa)) {
            furgonetas.add(f1);
        }

        Furgoneta f2 = new Furgoneta(11, "BBB115", "2021", "Renault");
        if (!existeFurgoneta(furgonetas, f2.placa)) {
            furgonetas.add(f2);
        }

        Furgoneta f3 = new Furgoneta(10, "BBB116", "2022", "Renault");
        if (!existeFurgoneta(furgonetas, f3.placa)) {
            furgonetas.add(f3);
        }

        Furgoneta f4 = new Furgoneta(11, "BBB117", "2023", "Renault");
        if (!existeFurgoneta(furgonetas, f4.placa)) {
            furgonetas.add(f4);
        }
    }
}
