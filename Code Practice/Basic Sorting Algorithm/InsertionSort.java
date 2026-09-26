import java.util.Arrays;

public class InsertionSort {

    /* 
    { 5 | 2, 4, 6, 1, 3 }
      ↓
    { 2, 5 | 4, 6, 1, 3 }   // insert 2
         ↓
    { 2, 4, 5 | 6, 1, 3 }   // insert 4
            ↓
    { 2, 4, 5, 6 | 1, 3 }   // insert 6
               ↓
    { 1, 2, 4, 5, 6 | 3 }   // insert 1
                  ↓
    { 1, 2, 3, 4, 5, 6 }     // insert 3
    */

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prev = i - 1;

            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }

            array[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}