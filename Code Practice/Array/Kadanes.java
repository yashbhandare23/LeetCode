public class Kadanes {

    public static int kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i=0; i<numbers.length;i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int numbers[] = {2,4,6,8};
        int maxSum = kadanes(numbers);

        System.out.println(maxSum);
        
    }
    
}
