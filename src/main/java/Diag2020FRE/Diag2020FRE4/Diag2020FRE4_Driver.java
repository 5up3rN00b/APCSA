package Diag2020FRE.Diag2020FRE4;

import java.util.Arrays;

public class Diag2020FRE4_Driver {
    public static void main(String[] args) {
        int[][] m = new int[][]{{1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12}};

        Matrix matrix = new Matrix(m);
        matrix.reverseAllRows();
        System.out.println(Arrays.deepToString(matrix.getMat()));
        matrix.reverseAllRows();
        System.out.println(Arrays.deepToString(matrix.getMat()));
        matrix.reverseMatrix();
        System.out.println(Arrays.deepToString(matrix.getMat()));
    }
}
