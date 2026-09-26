public class ReverseArray{

    public static int[] reverseArray(int revnumbers[]){
        int start = 0;
        int end = revnumbers.length-1;

        while (start < end){
            int temp = revnumbers[end];
            revnumbers[end] = revnumbers[start];
            revnumbers[start] = temp;
            start++;
            end--;
        }

        return revnumbers;
    }

    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5};
        numbers = reverseArray(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}