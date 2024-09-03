package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenThreeElements() {
        int[] data = new int[] {3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenFiveElements() {
        int[] data = new int[] {10, 13, 9, 7, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 7, 9, 10, 13};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenFourElements() {
        int[] data = new int[] {4, 2, 0, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 4};
        assertThat(result).containsExactly(expected);
    }
}