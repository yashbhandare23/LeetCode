public class DecimalToBinary {
    private static int decToBin(int decNum){
        int binNum = 0;
        int pow = 0;
        while (decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum /2;

        }
        
        return binNum;
    }
    public static void main(String[] args) {
        int decNum = 5;
        int BinNum = decToBin(decNum);
        System.out.println(BinNum);
    }
    
}
