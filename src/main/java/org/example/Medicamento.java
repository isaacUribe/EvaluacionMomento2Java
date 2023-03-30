package org.example;

import java.time.LocalDate;

public  abstract class Medicamento {
    private String nombre;
    private double precio;
    private double UnitarioSinIva;
    private double registroInvima;
    private String fabricante;
    private LocalDate fechaVencimiento;
    private LocalDate fechaFabricacion;

    private final double  Iva = 0.19;



    public Medicamento() {
    }


    public Medicamento(String nombre, double precio, double unitarioSinIva, double registroInvima, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        this.nombre = nombre;
        this.precio = precio;
        UnitarioSinIva = unitarioSinIva;
        this.registroInvima = registroInvima;
        this.fabricante = fabricante;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getUnitarioSinIva() {
        return UnitarioSinIva;
    }

    public void setUnitarioSinIva(double unitarioSinIva) {
        UnitarioSinIva = unitarioSinIva;
    }

    public double getRegistroInvima() {
        return registroInvima;
    }

    public void setRegistroInvima(double registroInvima) {
        this.registroInvima = registroInvima;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public double getIva() {
        return Iva;
    }

    public abstract double calcularDescuento();

    public abstract double calcularIva();

    public abstract double calcularPrecioTotal();
}
