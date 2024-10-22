import java.util.Scanner;
// Product of two number = lcm x hcf ---> n1 x n2 = hcf x lcm
// lcm = (n1 x n2 ) / gcd;
public class GreatestCommonDivisor {
    public static int lcm(int num1 , int num2){
        int Gcd = gcd(num1,num2);
        int Lcm = (num1*num2)/Gcd;
        return Lcm;
    }
    public static int gcd(int num1 , int num2){
        int divisor = num1;
        int dividend = num2;

        /*  It Can be Handled Automatically during division
        if(num1 < num2){
            divisor = num1;
            dividend = num2;
        }
        else {
            divisor = num2;
            dividend = num1;
        } */

        while(dividend%divisor != 0){
            int rem = dividend%divisor;
                dividend = divisor;
                divisor = rem;
        }

       return divisor;
    }
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int num1 = input.nextInt();
          int num2 = input.nextInt();
          int Gcd = gcd(num1 , num2);
          int Lcm = lcm(num1 , num2);
          System.out.println(Gcd);
          System.out.println(Lcm);
    }
}
