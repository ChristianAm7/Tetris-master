package com.example.tetris;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TDD {

    @Test
    public void bajarHastaElFinal() {
        Tablero tablero = new Tablero();
        Pieza pieza = new Pieza(4,0);
        tablero.moverPiezas(pieza, 'f');
        int[] expected = {18, 18, 18, 19};
        int[] actual = new int[4];
        actual[0] = pieza.y1;
        actual[1] = pieza.y2;
        actual[2] = pieza.y3;
        actual[3] = pieza.y4;
        assertArrayEquals(expected, actual);
    }


}