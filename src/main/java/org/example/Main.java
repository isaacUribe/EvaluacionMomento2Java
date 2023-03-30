package org.example;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AntiInfeccioso medi1 = new AntiInfeccioso("nom1",10000,10000,4561264,"Costa", LocalDate.of(2023,05,24),LocalDate.of(2023,04,25));


        String factura = medi1.toString();
        System.out.println(factura);





    }
}