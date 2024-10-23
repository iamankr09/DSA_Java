import java.util.Scanner;

public class Pattern6 {
    public static void HollowDiamondPattern(int n){
        int stars = n/2+1;
        int spaces = 1;
        for(int row = 1 ; row <= n ; row++){
            // stars
            for(int i = 1 ; i <= stars ; i++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1 ; j <= spaces ; j++ ){
                System.out.print(" ");
            }
            // stars
            for(int i = 1 ; i <= stars ; i++){
                System.out.print("*");
            }
            System.out.println();

            if(row <= n/2){
                stars -= 1;
                spaces +=2;
            }
            else{
                stars += 1;
                spaces -=2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HollowDiamondPattern(n);
    }
}
