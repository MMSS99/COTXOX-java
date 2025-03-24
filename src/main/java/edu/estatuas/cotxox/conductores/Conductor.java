package edu.estatuas.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor(){}

    public Conductor(String nombre){
        this.nombre = nombre;
    }

    //setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    //getter
    public boolean isOcupado(){
        return this.ocupado;
    }

    public String getNombre() {return this.nombre;}

    public String getModelo() {return this.modelo;}

    public String getMatricula() {return this.matricula;}

    public double getValoracion() {
        if(valoracionMedia == 0 && !valoraciones.isEmpty()){calcularValoracionMedia();} else if (valoraciones.isEmpty()){return 0.0d;}
        return this.valoracionMedia;}

    //methods
    private void calcularValoracionMedia(){
        this.valoracionMedia = valoraciones.stream().mapToInt(num -> num.intValue()).sum()/Double.valueOf(valoraciones.size());
    }

    @Override
    public String toString() {
        return getNombre() + "(" + getModelo() + ", " + getMatricula() + ")";
    }
}
