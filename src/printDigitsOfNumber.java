import java.util.Scanner;
public class printDigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printDigits(n);
    }

    public static void printDigits(int n){
        int TotalDigits = countDigitOfNumbers(n);
        int Divisor = (int)Math.pow(10 , TotalDigits-1);
        while(Divisor > 0){
            System.out.println(n/Divisor);
            n %= Divisor;
            Divisor /= 10;
        }
    }

    public static int countDigitOfNumbers(int n){
        int TotalDigits = 0;
        while(n > 0){
            TotalDigits++;
            n /= 10;
        }

        return TotalDigits;
    }
}
