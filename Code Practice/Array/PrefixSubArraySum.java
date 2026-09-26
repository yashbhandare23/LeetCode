public class PrefixSubArraySum {

    public static int maxSubArraySum(int numbers[]){
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum = i == 0 ? prefix[j]: prefix[j]-prefix[i-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8};
        int maxSum = maxSubArraySum(numbers);
        System.out.println(maxSum);
        
    }
}
