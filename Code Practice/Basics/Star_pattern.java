class Star_pattern{
    public static void main(String args[]){
        int n = 3;
        //char ch = 'A';
        for (int i =1; i<=n;i++){
            //for (int j=1; j<=i;j++){ //Stars
            for (int j=1; j<=n-i+1;j++){
                System.out.print("*");
                //System.out.print(j); numbers
                //System.out.print(ch); charcters
                //ch++;
            }
            System.out.println(" ");
        }
    }
}