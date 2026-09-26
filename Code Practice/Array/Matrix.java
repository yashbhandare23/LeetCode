import java.util.Scanner;

public class Matrix {
    /* 
       j →  0   1   2
    i
    ↓   0 |  1   2   3
        1 |  4   5   6
        2 |  7   8   9
    */

    public static boolean search(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {

            if (matrix[i][j] == key) {
                System.out.println("found at cell (" + i + "," + j + ")");
                return true;
            }
        }
    }
    return false;
    }

    public static void main(String args[]) {

        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        search(matrix, 9);
    }
}