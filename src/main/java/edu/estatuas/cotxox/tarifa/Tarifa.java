package edu.estatuas.cotxox.tarifa;

import edu.estatuas.cotxox.carrera.Carrera;

public class Tarifa {
    final static double COSTE_MILLA = 4.20d;
    final static double COSTE_MINUTO = 0.69d;
    final static double COSTE_MINIMO = 13.37d;
    final static byte PORCENTAJE_COMISION = 20;

    public static double getCosteDistancia(double distancia){
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int minutos){
        return minutos * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera){
        double totalComputado = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());

        return Math.max(totalComputado, COSTE_MINIMO);
        // return yourCondition ? "ifTrue" : "ifFalse";
    }
}


