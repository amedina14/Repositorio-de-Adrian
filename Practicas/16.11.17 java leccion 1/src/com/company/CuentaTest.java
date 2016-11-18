package com.company;

import static org.junit.Assert.*;

/**
 * Created by localuser on 17/11/2016.
 */
public class CuentaTest {
    @org.junit.Before
/*    public void setUp() throws Exception {

    }*/

/*    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("After");

    }*/
//assert es para hacer la evaluacion.

    @org.junit.Test //.Ingnore
    public void mostrar() throws Exception {
        Cuenta c = new Cuenta("Juan","A123");
        assertNotNull(c.mostrar());
    }

    @org.junit.Test
    public void pagar() throws Exception {
        Cuenta c = new Cuenta("Juan","A123");
        c.calcular(100);
        assertEquals("Juan pago 5.00, pendientes 0.70", 0.7, c.pagar(5.0),1);

    }

    @org.junit.Test
    public void calcular() throws Exception {
        Cuenta c = new Cuenta("Juan","A123");
        assertEquals("Consumo de 100 debe ser saldo 5.7 ", 5.7, c.calcular(100), 1);

    }

}