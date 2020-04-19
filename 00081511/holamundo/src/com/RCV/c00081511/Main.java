package com.RCV.c00081511;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ServicioProfecional sv = new ServicioProfecional("Rigoberto","Digital Analyst",300.00,
                6);
        PlazaFija pf = new PlazaFija("Campos","Analyst Chief",1300.00,2);

        CalculadoraImpuesto ci = CalculadoraImpuesto.getInstance();

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(sv);
        listaEmpleados.add(pf);

        for (Empleado e: listaEmpleados) {
            System.out.println("El salario del empleado " + e.nombre + " es: $"+ ci.calcularPago(e)
                    + "\n Este empleado pertenece a la planilla de "+
                    e.getClass().getName().substring(e.getClass().getName().lastIndexOf(".")+1)
                    +" y su total en descuentos se detalla: " + ci.mostrarTotales());
            System.out.println();
        }

    }
}
