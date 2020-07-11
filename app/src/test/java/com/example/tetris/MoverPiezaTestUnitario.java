package com.example.tetris;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MoverPiezaTestUnitario {

    @Test
    public void moverDerecha() {
        Pieza pieza = new Pieza(2,0);
        int[] expected = new int[4];
        int[] actual = new int[4];
        expected[0] = pieza.x1 + 1;
        expected[1] = pieza.x2 + 1;
        expected[2] = pieza.x3 + 1;
        expected[3] = pieza.x4 + 1;
        pieza.mover(1,0);
        actual[0] = pieza.x1;
        actual[1] = pieza.x2;
        actual[2] = pieza.x3;
        actual[3] = pieza.x4;
        assertArrayEquals(expected, actual);
    }

    @Test
    public void moverIzquierda() {
        Pieza pieza = new Pieza(3,0);
        int[] expected = new int[4];
        int[] actual = new int[4];
        expected[0] = pieza.x1 - 1;
        expected[1] = pieza.x2 - 1;
        expected[2] = pieza.x3 - 1;
        expected[3] = pieza.x4 - 1;
        pieza.mover(-1,0);
        actual[0] = pieza.x1;
        actual[1] = pieza.x2;
        actual[2] = pieza.x3;
        actual[3] = pieza.x4;
        assertArrayEquals(expected, actual);
    }

    @Test
    public void moverAbajo() {
        Pieza pieza = new Pieza(4,0);
        int[] expected = new int[4];
        int[] actual = new int[4];
        expected[0] = pieza.y1 + 1;
        expected[1] = pieza.y2 + 1;
        expected[2] = pieza.y3 + 1;
        expected[3] = pieza.y4 + 1;
        pieza.mover(0,1);
        actual[0] = pieza.y1;
        actual[1] = pieza.y2;
        actual[2] = pieza.y3;
        actual[3] = pieza.y4;
        assertArrayEquals(expected, actual);
    }

}