package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El transporte " + getIdTransporte() + " ha atracado y está listo para descarga.");
    }

    public void mostrarDatos() {
        double costoViaje = cantidadContenedores * 150.0; // Ejemplo de cálculo de costo
        System.out.println("ID: " + getIdTransporte() + " | Contenedores: " + cantidadContenedores);
        System.out.println("Costo de Viaje: " + costoViaje + " USD");
    }
}