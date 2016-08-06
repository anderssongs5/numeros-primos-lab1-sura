package com.sura.arl.laboratorio1.numerosprimos;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroPrimoTest {

    @Test
    public final void testNumeroPrimo1() {
        assertTrue(NumeroPrimo.esPrimo(1));
    }

    @Test
    public void testNumeroPrimo2() {
        assertTrue(NumeroPrimo.esPrimo(2));
    }

    @Test
    public void testNumeroPrimoFalse() {
        assertFalse(NumeroPrimo.esPrimo(4));
    }

    @Test
    public void testNumeroPrimoOkCiclo() {
        assertTrue(NumeroPrimo.esPrimo(957));
    }
}
