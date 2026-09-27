public class SearchCompleteSortedMatrix {

    public static boolean search(int matrix[][], int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                System.out.println("("+row+", "+col+")");
                return true;
            }

            if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 5, 9},
            {14, 20, 21},
            {30, 34, 43}
        };

        int target = 21;

        System.out.println("Element Found = " + search(matrix, target));
    }
}