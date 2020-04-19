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

    public double calcularEmpleado(Empleado empleado){

        return 1.1;
    }

    public String mostrarTotales(){

        return "";
    }
}