import java.util.Scanner;

public class Fibonacci {


    public static int fib(int n) {
    if(n == 1){
        return 0;
    }
    else if(n==2){
        return 1;
    }
    else{
        return fib(n-2)+fib(n-1);
    }
    }
    public static  void  main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();

        for(int i=1; i<=num;i++)
        {
            System.out.print(fib(i)+" \t");
        }
    }


}
