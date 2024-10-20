import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        int revNum = ReverseNumber(n);
        System.out.println(revNum);
    }

    public static int ReverseNumber(int n){
        int revNum = 0;
        int MultiPly = 10;
        while( n > 0){
            revNum = revNum*MultiPly + (n%10);
            n /= 10;

        }
        return revNum;
    }
}
