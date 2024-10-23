import java.util.Scanner;

public class Pattern9 {
    public static void StarPattern(int n){
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= n ; col++){
                if(row == col || row+col == n+1){
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
       StarPattern(n);
    }
}
