import java.util.Arrays;

public class Array2DExplorer {

    public static int minRow(int[][] matrix, int row) {
        int min = matrix[row][0];
        for (int n : matrix[row]) {
            if (n < min)
                min = n;
        }
        return min;
    }

    public static int[] colsMax(int[][] matrix) {
        int[] colsMax = new int[matrix[0].length];
        for (int col = 0; col < matrix[0].length; col++) {
            int max = matrix[0][col];
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] >= max) {
                    max = matrix[row][col];
                }
            }
            colsMax[col] = max;
        }
        return colsMax;
    }

    public static int[] allRowSums(int[][] matrix) {
        int[] allRowSums = new int[matrix.length];
        for (int r = 0; r < matrix.length; r++) {
            int rowSum = 0;
            for (int c = 0; c < matrix[0].length; c++) {
                rowSum += matrix[r][c];
            }
            allRowSums[r] = rowSum;
        }
        return allRowSums;
    }

    public static double[] colAves(int[][] matrix) {
        double[] colAves = new double[matrix[0].length];
        for (int c = 0; c < matrix[0].length; c++) {
            int colSum = 0;
            for (int r = 0; r < matrix.length; r++) {
                colSum += matrix[r][c];
            }
            colAves[c] = colSum/(double) matrix.length;
        }
        return colAves;
    }

    public static int smallEven(int[][] matrix) {
        int minEven = matrix[0][0];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if ((minEven == 1) || ((matrix[r][c] <= minEven) && (matrix[r][c] % 2 == 0)))
                minEven = matrix[r][c];
            }
        }
        return minEven;
    }

    public static int biggestRow(int[][] matrix) {
        int[] rowSums = Array2DExplorer.allRowSums(matrix);
        int maxSum = rowSums[0];
        int index = 0;
        for (int i = 0; i < rowSums.length; i++) {
            if (rowSums[i] >= maxSum) {
                maxSum = rowSums[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{1,69,1000000,88},{0,11,111,1111}};

        System.out.println("minRow     -> expecting: 0\n              received:  " + Array2DExplorer.minRow(nums, 2));

        System.out.println("colsMax    -> expecting: [1, 69, 1000000, 1111]\n              received:  " + Arrays.toString(Array2DExplorer.colsMax(nums)));

        System.out.println("allRowSums -> expecting: [10, 1000158, 1233]\n              received:  " + Arrays.toString(Array2DExplorer.allRowSums(nums)));

        System.out.println("colAves    -> expecting: [0.6666666666666666, 27.333333333333332, 333371.3333333333, 401.0]\n              received:  " + Arrays.toString(Array2DExplorer.colAves(nums)));

        System.out.println("smallEven  -> expecting: 0\n              received:  " + Array2DExplorer.smallEven(nums));

        System.out.println("biggestRow -> expecting: 1\n              received:  " + Array2DExplorer.biggestRow(nums));
    }
}