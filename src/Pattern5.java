import java.util.Scanner;

public class Pattern5 {
    public static void DiamondPattern(int n){
        int spaces = n/2;
        int stars = 1;
         for(int row = 1 ; row <= n ;  row++){
              for(int j = 1 ; j <= spaces ; j++){
                  System.out.print(" ");
              }
              for(int k = 1 ; k <= stars ; k++){
                  System.out.print("*");
              }
             System.out.println();
              if(row <= n/2){
                  spaces--;
                  stars +=2;
              }
              else{
                   spaces++;
                   stars -= 2;
              }
         }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        DiamondPattern(n);
    }
}
