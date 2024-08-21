package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP4K2Area1() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP6K2Area2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void  whenP8K4Area2Dot56() {
        int p = 8;
        int k = 4;
        double expected = 2.56;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
