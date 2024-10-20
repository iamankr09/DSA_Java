import java.util.Scanner;

public class printAllPrime {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int low = input.nextInt();
        int high = input.nextInt();

        for(int i = low  ; i <= high ; i++){
             boolean isPrime = Prime(i);
             if(isPrime)
                 System.out.println(i);
        }
    }

    public static boolean Prime(int n){
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
              if(n%i == 0) return false;
        }
        return true;
    }
}
