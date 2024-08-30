package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EndWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'o'};
        boolean result = EndWith.endWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'a'};
        boolean result = EndWith.endWith(word, postfix);
        assertThat(result).isFalse();
    }
}