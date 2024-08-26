package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер целочисленного массива ages равен - " + ages.length + " ячеек.");
        String[] surnames = new String[100500];
        System.out.println("Размер строкового массива surnames равен - " + surnames.length + " ячеек.");
        float[] prices = new float[40];
        System.out.println("Размер массива prices типа float равен - " + prices.length + " ячейкам.");
    }
}
