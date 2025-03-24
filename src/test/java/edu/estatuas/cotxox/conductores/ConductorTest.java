package edu.estatuas.cotxox.conductores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConductorTest {

    @Test
    void testGetValoracion() {
        Conductor conductor = new Conductor("Paco el Testeado");
        conductor.setValoracion((byte)5);
        conductor.setValoracion((byte)5);
        conductor.setValoracion((byte)4);
        conductor.setValoracion((byte)4);

        assertEquals(conductor.getValoracion(), 4.5d);
    }
}