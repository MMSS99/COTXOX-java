package edu.estatuas.cotxox.carrera;

import edu.estatuas.cotxox.conductores.Conductor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarreraTest {

    Carrera carrera = new Carrera("soyunatarjeta");

    @BeforeEach
    void setUp(){
        carrera.setDistancia(40d);
        carrera.setTiempoEsperado(10);
    }

    @Test
    void getCosteTotal() {
        assertEquals(174.9d, carrera.getCosteEsperado());
    }

}