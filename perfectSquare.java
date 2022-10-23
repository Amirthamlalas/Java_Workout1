import java.util.Scanner;

public class perfectSquare {

    public static void main(String[] args){
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("enter the last number");
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc1.nextInt();

        for(int i=num1 ; i<=num2;i++){
            for(int j=1;j<=100;j++){
                if((j*j)==i){
                    System.out.println(i);
                }
            }
        }
    }
}
