// задача 16
class Matrix {
    private int row;
    private int column;
    int[][] matrix;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        matrix = new int[row][column];
    }

    public Matrix(int[][] matrix) {
        this.row = matrix.length;
        this.column = matrix[0].length;
        this.matrix = matrix;
    }

    public Matrix add(Matrix other)
    {
        Matrix result = new Matrix(row, column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result.matrix[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(row, other.column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < other.column; j++) {
                for (int k = 0; k < column; k++) {
                    result.matrix[i][j] += matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return result;
    }
}