package edu.estatuas.cotxox.conductores;

import java.util.List;
import java.util.Random;

public class PoolConductores {
    private List<Conductor> listaConductores;

    public PoolConductores(List<Conductor> listaConductores) {
        this.listaConductores = listaConductores;
    }

    public List<Conductor> getListaConductores() {
        return this.listaConductores;
    }

    public Conductor asignarConductor(){
        Conductor conductorSeleccionado = null;
        Random random = new Random();
        int intentofallido = 0;
        final int MAXINTENTOS = 10;
        boolean asignado = false;


        while (intentofallido < MAXINTENTOS && !asignado) {
            conductorSeleccionado = this.listaConductores.get(random.nextInt(this.listaConductores.size()));
            if (conductorSeleccionado.isOcupado()){
                intentofallido++;
        } else {
                conductorSeleccionado.setOcupado(true);
                asignado = true;
            }

        }
        return conductorSeleccionado;
    }
}
