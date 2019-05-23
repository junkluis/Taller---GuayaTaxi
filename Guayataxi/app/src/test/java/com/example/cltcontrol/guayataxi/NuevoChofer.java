package com.example.cltcontrol.guayataxi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class NuevoChofer {

    @Test
    public void choferPromedio() {
        assertTrue(MainActivity.validarDatosTaxista("Luis", "QWERTY", "Nisan", 55));
    }


}
