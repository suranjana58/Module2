package Assignment4;
public class MatrixAdd{
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3}, {4,5,6}, {8,8,8}};
        int[][] matrix2 = {{9,9,7}, {6,7,4}, {3,2,4}};
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Result of matrix addition:");
        printMatrix(result);
    }
    
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }}
}

