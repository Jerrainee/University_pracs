package block4.prac20.task5;

/**
 * Практическая работа № 20. Задание 5.
 * Обобщенный класс Matrix (Матрица), параметризованный числовым типом T.
 */
public class Matrix<T extends Number> {

    private final int rows;
    private final int cols;
    private final Double[][] data;

    public Matrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("неверный размер");
        }
        this.rows = rows;
        this.cols = cols;
        this.data = new Double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = 0.0;
            }
        }
    }

    public Matrix(T[][] input) {
        if (input == null || input.length == 0 || input[0].length == 0) {
            throw new IllegalArgumentException("пустой массив");
        }
        this.rows = input.length;
        this.cols = input[0].length;
        this.data = new Double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = input[i][j] != null ? input[i][j].doubleValue() : 0.0;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Double get(int row, int col) {
        checkBounds(row, col);
        return data[row][col];
    }

    public void set(int row, int col, T value) {
        checkBounds(row, col);
        data[row][col] = value != null ? value.doubleValue() : 0.0;
    }

    private void checkBounds(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("индекс вне границ");
        }
    }

    public Matrix<Double> add(Matrix<? extends Number> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("размеры не совпадают");
        }
        Matrix<Double> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.get(i, j);
            }
        }
        return result;
    }

    public Matrix<Double> subtract(Matrix<? extends Number> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("размеры не совпадают");
        }
        Matrix<Double> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - other.get(i, j);
            }
        }
        return result;
    }

    public Matrix<Double> multiply(Matrix<? extends Number> other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("нельзя умножить");
        }
        Matrix<Double> result = new Matrix<>(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0.0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.data[i][k] * other.get(k, j);
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    public Matrix<Double> multiplyScalar(double scalar) {
        Matrix<Double> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    public Matrix<Double> transpose() {
        Matrix<Double> result = new Matrix<>(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[j][i] = this.data[i][j];
            }
        }
        return result;
    }

    public void print(String title) {
        if (title != null && !title.isEmpty()) {
            System.out.println(title.toLowerCase() + ":");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
