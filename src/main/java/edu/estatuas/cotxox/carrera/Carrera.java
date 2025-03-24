package edu.estatuas.cotxox.carrera;

import edu.estatuas.cotxox.conductores.Conductor;
import edu.estatuas.cotxox.conductores.PoolConductores;
import edu.estatuas.cotxox.tarifa.Tarifa;

public class Carrera {

    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;
    private Conductor conductor;

    public Carrera(String tarjetacredito){
        this.tarjetaCredito = tarjetacredito;
    }

    //setters
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

    public void asignarConductor(PoolConductores conductores){
        this.conductor = conductores.asignarConductor();
    }

    public void recibirPropina(int propina){this.propina = propina;}


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

    public double getCosteEsperado(){
        if(this.costeTotal == 0.0d){this.calcularCosteEsperado();}
        return this.costeTotal;
    }
    //terriblemente redundante
    public double getCosteTotal(){
        return this.costeTotal;
    }

    public Conductor getConductor(){
        return this.conductor;
    }

    public int getTiempoEsperado(){ return this.tiempoEsperado; }

    public int getPropina(){ return this.propina; }

    //methods

    public void calcularCosteEsperado(){
        this.costeTotal = Tarifa.getCosteTotalEsperado(this);
    }

    public void realizarPago(double pago){
        if(pago >= getCosteEsperado())
            {System.out.println("Pago realizado con éxito");}
        else
            {System.out.println("Pago insuficiente; ¡Alerta de moroso!");}
    }

    public void liberarConductor(){
        getConductor().setOcupado(false);

    }

}

