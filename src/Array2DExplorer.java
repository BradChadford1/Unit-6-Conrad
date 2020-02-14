public class Array2DExplorer {

    public static int minRow(int[][] nums, int row) {
        int min = nums[row][0];
        for (int n : nums[row]) {
            if (n < min)
                min = n;
        }
        return min;

    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{2,4,6,8},{-1,11,111,1111}};

        System.out.println("" + Array2DExplorer.minRow(nums, 3));
    }
}

