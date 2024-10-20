import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int countOfDigits = countDigitOfNumbers(n);
        System.out.println("Total No. of digits in " + n + " is : " + countOfDigits);
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
