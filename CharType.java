import java.util.Scanner;
import java.util.regex.Pattern;
//using regex....
// \d specifies [0-9]...
public class CharType {
    public static void main (String[] args){
        System.out.println("Enter a character.");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if ( Pattern.matches("[a-z]", s)){
            System.out.println("Small letter. ");
        }else if(Pattern.matches("[A-Z]", s)){
            System.out.println("Capital letter. ");
        }else if(Pattern.matches("[0-9]", s)){
            System.out.println("Digit. ");
        }else if(Pattern.matches("[^A-Za-z0-9]", s)){
            System.out.println("Special character. ");
        }

    }
}
