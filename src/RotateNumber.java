import java.util.Scanner;

public class RotateNumber {
    public static int countDigitOfNumbers(int n){
        int TotalDigits = 0;
        while(n > 0){
            TotalDigits++;
            n /= 10;
        }

        return TotalDigits;
    }
    public static int rotateNumber(int n , int k){
        int TotalDigits = countDigitOfNumbers(n);
        k = k%TotalDigits; // Handle no of rotation > no of digit
        if(k < 0 ){
            k = k + TotalDigits;  // Handle neagtive numbers
        }
        int multiplier = (int)Math.pow(10 , TotalDigits - k);
        int divisor = (int)Math.pow(10,k);
        int rem = n%divisor;
        int quotient = n/divisor;

        return rem*multiplier + quotient;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int rotatedNum  = rotateNumber(n , k);
        System.out.println(rotatedNum);
    }
}
