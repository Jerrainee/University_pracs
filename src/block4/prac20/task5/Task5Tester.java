package block4.prac20.task5;

public class Task5Tester {
    public static void main(String[] args) {
        Integer[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Matrix<Integer> matrixA = new Matrix<>(arr1);
        matrixA.print("матрица a");

        Double[][] arr2 = {
                {0.5, 1.5, 2.5},
                {3.5, 4.5, 5.5}
        };
        Matrix<Double> matrixB = new Matrix<>(arr2);
        matrixB.print("матрица b");

        matrixA.add(matrixB).print("сложение");
        matrixA.subtract(matrixB).print("вычитание");
        matrixA.multiplyScalar(2.0).print("скаляр");
        Matrix<Double> transposedA = matrixA.transpose();
        transposedA.print("транспонирование");
        matrixA.multiply(transposedA).print("умножение");
    }
}
