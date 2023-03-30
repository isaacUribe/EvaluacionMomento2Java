package org.example;

import java.time.LocalDate;

public class AntiInfeccioso extends  Medicamento{

    public AntiInfeccioso() {
    }

    public AntiInfeccioso(String nombre, double precio, double unitarioSinIva, double registroInvima, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precio, unitarioSinIva, registroInvima, fabricante, fechaVencimiento, fechaFabricacion);
    }

    @Override
    public double calcularDescuento() {
        return 0;
    }

    private double valorIva;
    private double precioTotal;

    @Override
    public double calcularIva() {
        this.valorIva = this.getUnitarioSinIva() * this.getIva();
        return valorIva;
    }


    @Override
    public double calcularPrecioTotal() {
        this.precioTotal = this.getUnitarioSinIva() + calcularIva();
        return precioTotal;
    }
    @Override
    public String toString() {
        return "Antiinfeccioso{" +
                " valorIva=" + calcularIva() +
                ", precioTotal=" + calcularPrecioTotal() +
                '}';
    }



}
