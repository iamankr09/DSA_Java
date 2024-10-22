import java.util.Scanner;

public class Pattern4 {
    public static void InvertedMirrorRightAngled(int n){
        for(int i = n ; i >= 1 ; i--){
            // spaces
            for(int j = 1 ;  j <= (n-i) ; j++){
                System.out.print(" ");
            }
            // stars
            for(int k = i ; k >= 1 ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        InvertedMirrorRightAngled(n);
    }
}
