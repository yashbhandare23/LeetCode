public class SelectionSort {
    /* 
    { 5, 4, 3, 2, 1 }
      ↓
    { 1 | 4, 3, 2, 5 }   // min = 1, swap
          ↓
    { 1, 2 | 3, 4, 5 }   // min = 2, swap
             ↓
    { 1, 2, 3 | 4, 5 }   // min = 3
                ↓
    { 1, 2, 3, 4 | 5 }   // min = 4
    { 1, 2, 3, 4, 5 }     // sorted
    */

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){  //arr[minPos]<arr[j] : For descending order
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selectionSort(arr);
        
        System.out.print("{ ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" }");
    }
}
