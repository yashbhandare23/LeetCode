public class MaxSubArraySum {

    public static int sum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <numbers.length; i++){
            for (int j = i; j<numbers.length; j++){
                currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum += numbers[k];
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8};
        int maxSum = sum(numbers);
        System.out.println(maxSum);
    }
}
