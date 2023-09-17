public class Task4 {
    // *На шахматной доске расставить
    // 8 ферзей так, чтобы они не били друг друга.

    // Проверка на то можем ли мы поставить королеву
    private static boolean canPlaceQueen(int[][] chessField, int col) {

        if (col >= size) {
            return true;
        }

        // цикл для размещения
        for (int i = 0; i < size; i++) {
            if (dontCross(chessField, i, col)) {
                // размещаем
                chessField[i][col] = 1;
                // проверяем
                if (canPlaceQueen(chessField, col + 1)) {
                    return true;
                }
                // возвращаем если нет
                chessField[i][col] = 0;
            }
        }
        return false;
    }

    // Проверка на условия (бьёт/не бьёт) по всем направлениям
    private static boolean dontCross(int[][] chessField, int row, int col) {

        for (int i = 0; i < col; i++) {
            if (chessField[row][i] == 1) {
                return false;
            }
        }


        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessField[i][j] == 1) {
                return false;
            }
        }


        for (int i = row, j = col; i < size && j >= 0; i++, j--) {
            if (chessField[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Метод печати 4 зеркальных решений
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
        if (canPlaceQueen(chessField, 0)) {
            printBoard(chessField);
        } else {
            System.out.println("Решение не найдено.");
        }
    }

// Идея для вывода всех решений(слишком много условий не до конца разобрался)
//    public static int[] replace(int value){
//        int[]temp = new int[8];
//        for (int i = 0; i < temp.length; i ++) {
//            if (value > 7) {
//                value = 0;
//            }
//            temp[i]=value;
//            value++;
//        }
//        return temp;
//    }

//
//
//    private static boolean canPlaseQueen(int[][] chessField, int row, int col) {
//
//        int[] rows = replace(row);
//        int[] cols = replace(col);
//
//        if (col >= size) {
//        return true;
//        }
//
//
//        for (int i = 0; i < rows.length; i++) {
//            for (int j = 0; j < cols.length; j++){
//                if (dontCross(chessField, i, j)) {
//                    // размещаем
//                    chessField[rows[i]][cols[j]] = 1;
//                    // проверяем
//                    if (canPlaseQueen(chessField, row,col)) {
//                        return true;
//                    }
//                    // возвращаем если нет
//                    chessField[rows[i]][cols[j]] = 0;
//                }
//            }
//        }
//        return false;
//    }
//
//    private static boolean dontCross(int[][] chessField, int row, int col) {
//        // Проверка по горизонтали
//        int[] rows = replace(row);
//        int[] cols = replace(col);
//
//        for (int i = 0; i < rows.length; i++) {
//            for(int j = 0; j < cols.length; j++) {
//                if (chessField[rows[i]][cols[j]] == 1) {
//                    return false;
//                }
//            }
//        }
//
//        // Проверка по диагонали ↖
//        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//            if (chessField[rows[i]][cols[j]] == 1) {
//                return false;
//            }
//        }
//
//        // Проверка по диагонали ↗
//        for (int i = row, j = col; i < size && j >= 0; i++, j--) {
//            if (chessField[rows[i]][cols[j]] == 1) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private static void printBoard(int[][] board) {
//
//        System.out.println("_________________");
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print("|");
//                System.out.print(board[i][j]);
//            }
//            System.out.print("|");
//            System.out.println();
//        }
//        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
//
//    }
//    static final int size = 8;
//
//    public static void main(String[] args) {
//        int[][] chessField = new int[size][size];
//        for(int i = 0; i < size; i++) {
//            for(int j = 0; j< size;j++){
//                if (canPlaseQueen(chessField, i,j)) {
//                    System.out.println("Решение для пары: X - " + i + " Y - " + j);
//                    printBoard(chessField);
//                } else {
//                    System.out.println("Решение не найдено.");
//                }
//            }
//        }
//    }
}
