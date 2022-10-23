import java.util.Scanner;

class Fahrenheit{
    Fahrenheit(double f){

        System.out.println("Fahrenheit value :" +f);
    }
    double ToCelsius(double fa){
        double ans =((fa-32)/1.8);
        return ans;
    }
}

public class Temperature {
    public static void main(String[] args){


        System.out.println("Enter the temperature in Fahrenheit");
        Scanner sc = new Scanner(System.in);
        double F = sc.nextFloat();
        Fahrenheit f1 = new Fahrenheit(F);
        double result = f1.ToCelsius(F);
        System.out.println("Temperature in Celsius:"+result);
    }
}
