import java.util.Scanner;

public class printFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         PrintFibonacci(n);
    }

    public static void PrintFibonacci(int n){
        int FirstNum = 0;
        int SecondNum = 1;
        for(int i = 1 ; i <= n ; i++){
            if(i == 1){
                System.out.print(FirstNum + " ");
            }
            else if(i == 2){
                System.out.print(SecondNum + " ");
            }
            else{
                int currNum = FirstNum + SecondNum;
                System.out.print(currNum + " ");
                FirstNum = SecondNum;
                SecondNum = currNum;
            }
        }
    }
}
