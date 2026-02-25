package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciación Segura
        CamionDEREparto camion = new CamionDEREparto("CAM-001", 50, 2000, true);
        BuqueCarga buque = new BuqueCarga("BUQ-99", 500, 50000, 50);

        // 2. Prueba de Fuego (Validación)
        System.out.println("--- Prueba de Validación ---");
        camion.setCombustible(-20);
        System.out.println("Combustible después de setCombustible(-20): " + camion.getCombustible());

        // 3. Demostración de Polimorfismo
        System.out.println("\n--- Prueba de Polimorfismo ---");
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            double combustibleAntes = t.getCombustible();
            t.viajar(100);
            System.out.println("Transporte " + t.getIdTransporte() + 
                               " consumió: " + (combustibleAntes - t.getCombustible()) + " unidades.");
        }
        
        // Extra: Probar método propio del buque
        System.out.println("");
        buque.atracarEnPuerto();
        buque.mostrarDatos();
    }
}