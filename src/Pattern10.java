import java.util.Scanner;

public class Pattern10 {
    public static void StarPattern2(int n){
        int OuterSpace = n/2;
        int innerSpace = 1;
        for(int i = 1 ; i <= n ; i++){
            if(i == 1 || i == n){
               for(int j = 1 ; j <= OuterSpace ; j++){
                   System.out.print(" ");
               }
               System.out.print("*");
            }
            else{
                 for(int j = 1 ; j <= OuterSpace ; j++){
                     System.out.print(" ");
                 }
                 System.out.print("*");
                 for(int j = 1 ; j <= innerSpace ; j++){
                     System.out.print(" ");
                 }
                System.out.print("*");
            }
            System.out.println();
            if(i <= n/2){
                OuterSpace--;
                innerSpace += 2;
            }
            else{
                OuterSpace++;
                innerSpace -=2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StarPattern2(n);
    }
}
