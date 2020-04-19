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
            totalRenta = empleado.getSalario()*0.1;

        }else{
            totalAfp = empleado.getSalario()*0.0625;
            totalIsss = empleado.getSalario()*0.03;
            double variable = empleado.getSalario() -  totalIsss -  totalAfp;
            totalRenta = variable <= 472 ? 0:
                    variable <= 895.24 ? (0.1*(variable - 472) + 17.67):
                            variable <= 2038.10 ? (0.2*(variable - 895.24) + 60) :
                                    (0.3*(variable - 2038.10) + 288.57);
            totalRenta = totalRenta < 0 ? totalRenta * -1 : totalRenta;
        }
        return empleado.getSalario() -  totalIsss -  totalAfp - totalRenta;
    }

    public String mostrarTotales(){

        return "AFP: $" + totalAfp + " ISSS: $" + totalIsss + " Renta: $" + totalRenta;
    }
}