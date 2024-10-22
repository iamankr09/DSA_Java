import java.util.Scanner;

public class Pattern3 {
    public static void MirrorRightAngled(int n){
         for(int i = 1 ; i  <= n ; i++){
             // spaces
             for(int j = 1 ;  j <= n-i ; j++){
                 System.out.print(" ");
             }
             // stars
             for(int k = 1 ; k <= i ; k++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        MirrorRightAngled(n);
    }
}
