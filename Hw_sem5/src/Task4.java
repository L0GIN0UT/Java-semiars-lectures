public class Task4 {
    // *На шахматной доске расставить
    // 8 ферзей так, чтобы они не били друг друга.

    private static boolean canPlaseQueen(int[][] chessField, int col) {
        if (col >= size) {
            return true;
        }

        for (int i = 0; i < size; i++) {
            if (dontCross(chessField, i, col)) {
                // размещаем
                chessField[i][col] = 1;
                // проверяем
                if (canPlaseQueen(chessField, col + 1)) {
                    return true;
                }
                // возвращаем если нет
                chessField[i][col] = 0;
            }
        }

        return false;
    }

    private static boolean dontCross(int[][] chessField, int row, int col) {
        // Проверка по горизонтали
        for (int i = 0; i < col; i++) {
            if (chessField[row][i] == 1) {
                return false;
            }
        }

        // Проверка по диагонали ↖
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessField[i][j] == 1) {
                return false;
            }
        }

       // Проверка по диагонали ↗
        for (int i = row, j = col; i < size && j >= 0; i++, j--) {
            if (chessField[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        System.out.println("4 Зеркальных решения: ");
        System.out.println("Решение 1");
        System.out.println("_________________");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("|");
                System.out.print(board[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.println();
        System.out.println("Решение 2");
        System.out.println("_________________");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("|");
                System.out.print(board[7-i][7-j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.println();
        System.out.println("Решение 3");
        System.out.println("_________________");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("|");
                System.out.print(board[7-i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.println();
        System.out.println("Решение 4");
        System.out.println("_________________");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("|");
                System.out.print(board[i][7-j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }
    static final int size = 8;

    public static void main(String[] args) {
        int[][] chessField = new int[size][size];
        if (canPlaseQueen(chessField, 0)) {
            printBoard(chessField);
        } else {
            System.out.println("Решение не найдено.");
        }
    }
}
