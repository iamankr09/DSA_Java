import java.util.Scanner;

public class Pattern2 {
    public static void InvertedRightAngleTriangle(int n){
        for(int i = n ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        InvertedRightAngleTriangle(n);
    }
}
