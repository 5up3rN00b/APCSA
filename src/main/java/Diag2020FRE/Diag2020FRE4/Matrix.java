package Diag2020FRE.Diag2020FRE4;


public class Matrix {
    private int[][] mat;

    public Matrix(int[][] m) {
        mat = m;
    }

    public int[][] getMat() {
        return mat;
    }

    public void reverseAllRows() {
        for (int i = 0; i < mat.length; i++) {
            ArrayUtil.reverseArray(mat[i]);
        }
    }

    public void reverseMatrix() {
        reverseAllRows();
        int height = mat.length;
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int temp = mat[height - i - 1][j];
                mat[height - i - 1][j] = mat[i][j];
                mat[i][j] = temp;
            }
        }
    }
}
