package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int destinition) {
        int temp = array[source];
        array[source] = array[destinition];
        array[destinition] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int i : result) {
            System.out.print(i);
        }
        /* чтобы не было путаницы в восприятии и для большей наглядности
        при решении задачи использовал новый массив чисел
        и отделил решения друг от друга переводом строки
         */
        System.out.println();

        int[] newNumbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] resultSwap = swap(newNumbers, 1, 4);
        for (int i : resultSwap) {
            System.out.print(i);
        }
    }

}
