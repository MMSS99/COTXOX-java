package edu.estatuas.cotxox.carrera;

public class Carrera {

    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private int costeEsperado;
    private double costeTotal;
    private int propina;

    //setters
    public Carrera(String tarjetacredito){
        this.tarjetaCredito = tarjetacredito;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public void setDistancia(double distancia){
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado){
        this.tiempoEsperado = tiempoEsperado;
    }

    //getters
    public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }

    public String getOrigen(){
        return this.origen;
    }

    public String getDestino(){
        return this.destino;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public int getCosteEsperado(){
        return this.costeEsperado;
    }

}

