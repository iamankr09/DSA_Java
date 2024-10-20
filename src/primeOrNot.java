import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        boolean isPrime = prime(n);
        if(isPrime)
          System.out.println(n + " is Prime");
        else System.out.println(n + " is not Prime");
    }

    static boolean prime(int n){
         for(int i = 2 ; i <= Math.sqrt(n) ; i++){
             if(n%i == 0) return false;
         }

         return true;
    }
}
