package com.example;

public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {
        if (tieneRefrigeracion) {
            // Consume el doble: 2 unidades por cada 10km (es decir, distancia / 5)
            double consumo = (distancia / 10.0) * 2;
            setCombustible(getCombustible() - consumo);
        } else {
            super.viajar(distancia);
        }
    }
}