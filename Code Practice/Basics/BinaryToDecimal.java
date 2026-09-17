public class BinaryToDecimal {

    public static int binToDec(int binNum){
        int decNum = 0;
        int pow = 0;
        while (binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit*(int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        return decNum;
    }
    public static void main(String[] args) {
        int binNum = 111;
        int decNum = binToDec(binNum);
        System.out.println(decNum);
    }
    
}
