public class SolidHollowRhombus{

    public static void solidHollowRhombus(int rows, int cols){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j<=cols-i ; j++){
                System.out.print("-");
            }
            for (int j = 1; j<=cols ; j++){
                if (i==1 || j == 1 || i == rows || j ==cols){
                        System.out.print("*");
                }else{
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /*
    ----****
    ---*  *-
    --*  *--
    -*  *---
    ****----
    */

    public static void main(String[] args){
        int rows = 4;
        int cols = 4;
        solidHollowRhombus(rows, cols);
    }
}