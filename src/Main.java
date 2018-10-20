import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Enter a positive integer as the index for a fibonacci sequence member: ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("You entered " + number);

        System.out.println("The fibonacci number for an index of " + number + " is " + computeFibonacci(number));

        System.out.println("The factorial of " + number + " computed with a recursive method that calls itself is " + computeFactorial(number));

        System.out.println("The Factorial figured with an iterative loop is " + computeLoopFactorial(number));

    }


    public static long computeFibonacci(int index){
        if( index < 0){
            return -1;
        }
        else if (index==0){
            return 0;
        }else if(index==1){
            return 1;
        }
        else {
            long fibonacciNumber = ( ( computeFibonacci(index-2) ) + ( computeFibonacci(index - 1) ) );
            return fibonacciNumber;
        }
    }

    public static long computeFactorial(int num){
        if ( num == 0){
            return 1;
        } else {
            long factorialOfNmm = num * computeFactorial(num-1);
            return factorialOfNmm;
        }
    }

    public static long computeLoopFactorial(int n){
        long loopFactorial = 1;
        if (n == 0 ){
            return 1;
        } else {
            for (int i = 1; i<=n; i++){
                loopFactorial = loopFactorial * i;

            }
            return loopFactorial;
        }
    }



}
