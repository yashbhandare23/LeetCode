import java.util.Arrays;

public class CountingSort{
    /* 
    arr:
    { 1, 4, 1, 3, 2, 4, 3, 7 }

    Count frequency:
    count → [0  2  1  2  2  0  0  1]
    value →  0  1  2  3  4  5  6  7
    

    Rebuild arr using count[]:

    1 → { 1, 1 }
    2 → { 1, 1, 2 }
    3 → { 1, 1, 2, 3, 3 }
    4 → { 1, 1, 2, 3, 3, 4, 4 }
    7 → { 1, 1, 2, 3, 3, 4, 4, 7 }

    Final:
    { 1, 1, 2, 3, 3, 4, 4, 7 }

    Time:  O(n + k)
    Space: O(k)
    */

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            largest= Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}