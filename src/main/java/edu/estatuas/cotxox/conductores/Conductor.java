package edu.estatuas.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones;

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

    public void setValoracion(double valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    //getter
    public boolean isOcupado(){
        return this.ocupado;
    }
}
