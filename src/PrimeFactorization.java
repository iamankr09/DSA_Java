import java.util.Scanner;

public class PrimeFactorization {
    public static void printPrimeFactors(int n){
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            while(n%i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }

        if(n != 1){
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        int n = input.nextInt();
        printPrimeFactors(n);
    }
}
