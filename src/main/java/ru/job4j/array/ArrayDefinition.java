package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер целочисленного массива ages равен - " + ages.length + " ячеек.");
        String[] surnames = new String[100500];
        System.out.println("Размер строкового массива surnames равен - " + surnames.length + " ячеек.");
        float[] prices = new float[40];
        System.out.println("Размер массива prices типа float равен - " + prices.length + " ячейкам.");
        String[] names = new String[5];
        names[0] = "Виктор";
        names[1] = "Полина";
        names[2] = "Петр";
        names[3] = "Стас";
        names[4] = "Валерий";
        System.out.println(Arrays.toString(names));
    }
}
