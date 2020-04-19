package com.RCV.c00081511;

public class CalculadoraImpuesto {

    private double totalRenta, totalIsss,totalAfp;
    private static CalculadoraImpuesto ci;

    private CalculadoraImpuesto() {
        this.totalAfp = 0;
        this.totalRenta = 0;
        this.totalIsss = 0;
    }

    public static CalculadoraImpuesto getInstance() {
        if (ci == null){
            ci = new CalculadoraImpuesto();
        }

        return ci;
    }

    public double calcularPago(Empleado empleado){
        if(empleado instanceof ServicioProfecional){
            totalRenta = 0.1;
        }else{
            totalRenta = 0;
            totalAfp = 0;
            totalIsss = 0;
        }

        return empleado.salario - empleado.salario * totalIsss - empleado.salario * totalAfp - empleado.salario * totalRenta;
    }

    public String mostrarTotales(){

        return "";
    }
}