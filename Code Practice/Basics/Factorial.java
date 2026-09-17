public class Factorial {

    public static int factorial(int n){
        /*int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;*/
        //Recursion
        if (n<=1){
            return 1;
        }
        return n * factorial(n-1);  
        
    }
    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println(fact);
    }
}
