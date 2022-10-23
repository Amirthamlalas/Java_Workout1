import java.util.Scanner;

class calc{

    void generateTriangle(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}


public class Triangle {
    public static void main(String[] args){

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        calc c = new calc();
        c.generateTriangle(num);
    }
}
