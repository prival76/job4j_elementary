package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStartIsLessthanFinish() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIsGreaterThanFinish() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIsEqualsFinish() {
        int start = 10;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumberFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFromMinusFiveToZero() {
        int start = -5;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = -6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFromStartLargerToFinish() {
        int start = 10;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);

    }
}
