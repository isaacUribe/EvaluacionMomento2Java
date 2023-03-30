package org.example;

import java.time.LocalDate;

public class Analgesico extends Medicamento{

    private double descuento = 0.05;
    private double valorDescuento;
    private double valorIva;
    private double precioTotal;

    public Analgesico() {
    }

    public Analgesico(String nombre, double precio, double unitarioSinIva, double registroInvima, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precio, unitarioSinIva, registroInvima, fabricante, fechaVencimiento, fechaFabricacion);
    }

    @Override
    public double calcularDescuento() {
        this.valorDescuento = this.getUnitarioSinIva() * this.descuento;
        return valorDescuento;
    }

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
        return "Analgesico{" +
                "descuento=" + this.descuento +
                ", valorDescuento=" + calcularDescuento()+
                ", valorIva=" + calcularIva() +
                ", precioTotal=" + calcularPrecioTotal() +
                '}';
    }
}
