package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            int resultAxisX = Math.abs(x1 - x2);
            int resultAxisY = Math.abs(y1 - y2);
            if (resultAxisX == resultAxisY) {
                result = resultAxisX;
            }
        }
        return result;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int numberOfCells = ChessBoard.way(7, 7, 0, 0);
        System.out.println("Number of cells :" + numberOfCells);
        numberOfCells = ChessBoard.way(10, 6, 4, -1);
        System.out.println("Number of cells :" + numberOfCells);

    }

}

