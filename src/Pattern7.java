import java.util.Scanner;

public class Pattern7 {
    public static void DiagonalPattern(int n){
        for(int row = 1 ; row  <= n ; row++){
            for(int col = 1 ;  col <= n ; col++){
                if(row == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        DiagonalPattern(n);
    }
}
