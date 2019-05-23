package com.example.cltcontrol.guayataxi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


}


public class EdadDelChoferTesting{
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(MainActivity.validarDatosTaxista("Luis", "QWERTY", "Nisan", 55));
    }
}

//(String nombreChofer, String placaChofer, String marca, int edadChofer) {