package com.example;

public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible); // Usamos el setter para aprovechar la validación
        setCapacidadCarga(capacidadCarga);
    }

    // Getters
    public String getIdTransporte() { return idTransporte; }
    public double getCombustible() { return combustible; }
    public double getCapacidadCarga() { return capacidadCarga; }

    // Setters con Lógica
    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else {
            this.combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Error: La capacidad de carga no puede ser negativa.");
        } else {
            this.capacidadCarga = carga;
        }
    }

    // Método viajar
    public void viajar(int distancia) {
        double consumo = distancia / 10.0;
        this.combustible -= consumo;
        if (this.combustible < 0) {
            this.combustible = 0;
        }
    }
}