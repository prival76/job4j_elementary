package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicNotTest {

    @Test
    void whenIsEvenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsEvenFalse() {
        int num = 3;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenIsPossitiveTrue() {
        int num = 3;
        boolean result = LogicNot.isPossitive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsPossitiveFalse() {
        int num = -2;
        boolean result = LogicNot.isPossitive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0IsPossitiveFalse() {
        int num = 0;
        boolean result = LogicNot.isPossitive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenFalse() {
        int num = 2;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenTrue() {
        int num = 3;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPossitiveTrue() {
        int num = -2;
        boolean result = LogicNot.notPossitive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPossitiveFalse() {
        int num = 2;
        boolean result = LogicNot.notPossitive(num);
        assertThat(result).isFalse();
    }

    @Test
    void  whenNumIs0NotPossitiveFalse() {
        int num = 0;
        boolean result = LogicNot.notPossitive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPossitiveTrue() {
        int num = 3;
        boolean result = LogicNot.notEvenAndPossitive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenFalseIsAllFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPossitive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenPossitiveFalseIsAllFalse() {
        int num = -3;
        boolean result = LogicNot.notEvenAndPossitive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPossitiveFalse() {
        int num = 0;
        boolean result = LogicNot.notEvenAndPossitive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenEvenOrNotPossitiveTrue() {
        int num = -2;
        boolean result = LogicNot.evenOrNotPossitive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenIsTrueThenAllTrue() {
        int num = 2;
        boolean result = LogicNot.evenOrNotPossitive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPossitiveIsTrueThenAllsTrue() {
        int num = -3;
        boolean result = LogicNot.evenOrNotPossitive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenOrNotPossitiveFalse() {
        int num = 3;
        boolean result = LogicNot.evenOrNotPossitive(num);
        assertThat(result).isFalse();
    }
}
