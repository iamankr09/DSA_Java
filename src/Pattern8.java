import java.util.Scanner;

public class Pattern8 {
        public static void LeftDiagonalPattern(int n){
            for(int row = 1 ; row  <= n ; row++){
                for(int col = 1 ;  col <= n ; col++){
                    if(col == n-row+1){
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
            LeftDiagonalPattern(n);
        }
}


