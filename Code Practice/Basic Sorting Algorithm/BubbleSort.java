public class BubbleSort{
    
    /*
    Initial: {5, 4, 1, 3, 2}

    ↓ Bubble Sort

    Pass 1 → {4, 1, 3, 2, 5}   5 moved to end
    Pass 2 → {1, 3, 2, 4, 5}
    Pass 3 → {1, 2, 3, 4, 5}
    Pass 4 → {1, 2, 3, 4, 5}
    */

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){

            boolean swapped = false;
            for(int j=0; j<arr.length-1-turn; j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        System.out.print("{ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print("}");
    }
}