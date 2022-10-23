import java.util.Scanner;

class  calcPalindrome{

    String isPalindrome(String s){

       String reverseStr = "";
       int strLength = s.length();

       for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + s.charAt(i);
        }
       System.out.println(reverseStr);
       return reverseStr;

    }

}

public class Palindrome {
    public static void main(String[] args){

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        calcPalindrome p = new calcPalindrome();
        String ans = p.isPalindrome(str);

        if(ans.equals(str)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }

    }
}
