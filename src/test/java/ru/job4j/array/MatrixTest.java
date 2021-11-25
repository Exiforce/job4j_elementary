package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void when2on2() {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when5on5() {
        int size = 5;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when4on4() {
        int size = 4;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16},
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when8on8() {
        int size = 8;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {2, 4, 6, 8, 10, 12, 14, 16},
                {3, 6, 9, 12, 15, 18, 21, 24},
                {4, 8, 12, 16, 20, 24, 28, 32},
                {5, 10, 15, 20, 25, 30, 35, 40},
                {6, 12, 18, 24, 30, 36, 42, 48},
                {7, 14, 21, 28, 35, 42, 49, 56},
                {8, 16, 24, 32, 40, 48, 56, 64}
        };
        Assert.assertArrayEquals(expected, result);
    }
}