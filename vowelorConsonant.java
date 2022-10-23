import java.util.Scanner;

public class vowelorConsonant {
    static String find(String c) {
        switch(c) {
            case "a":

            case "e":

            case "i":

            case "o":

            case "u":
                return "vowel";

            default:
                return "consonant";

        }
    }
    public static  void  main(String[] args){
        System.out.println("enter the character");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        String ans  = find(ch);
        System.out.println(ans);
    }
}
