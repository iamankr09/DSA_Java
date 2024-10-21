import java.util.Scanner;

public class InverseOfNumber {
    public static int Inverse(int n){
        int invNum = 0;
        int digitNum = 1;
        while(n > 0){
            int digitVal = n%10;
            int multiply = (int)Math.pow(10 , digitVal-1);
            invNum += (digitNum *multiply);
            n /= 10;
            digitNum++;
        }

        return invNum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int invNum = Inverse(n);
        System.out.println(invNum);
    }
}
