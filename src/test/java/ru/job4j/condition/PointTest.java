package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int  y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13To47Then5() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 4;
        int y2 = 7;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 5;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when65ToMinus185Then24() {
        int x1 = 6;
        int y1 = 5;
        int x2 = -18;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 24;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinys1022To45Then22Dot023() {
        int x1 = -10;
        int y1 = 22;
        int x2 = 4;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 22.023;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
