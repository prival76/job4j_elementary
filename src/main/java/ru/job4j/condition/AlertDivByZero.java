package ru.job4j.condition;

public class AlertDivByZero {
    public static void chekNumber(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }

        if (number < 0) {
            System.out.println("This is negative number.");
        }
        if (number > 0) {
            System.out.println("This is positive number.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.chekNumber(-4);
        AlertDivByZero.chekNumber(0);
        AlertDivByZero.chekNumber(6);
    }
}

