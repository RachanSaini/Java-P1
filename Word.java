import java.util.Scanner;
import java.lang.String;
public class Word {
    public void vowel(){
        System.out.println("Enter a word: ");
        Scanner scan = new Scanner(System.in);
        char[] enter = scan.nextLine().toCharArray();
        char[] vowels = "aeiou".toCharArray();
        boolean flag = false ;
        for(int j=0 ; j<enter.length ;j++) {
            for (int k = 0; k < vowels.length; k++) {
                if (enter[j] == vowels[k]) {
                    System.out.print(enter[j] + " is a vowel. ");
                    break;
                }

            }

        }
    }
    public static void main (String[] args) {
        Word w = new Word();
        w.vowel();
    }
}
