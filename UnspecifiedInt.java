import java.util.Scanner;

public class UnspecifiedInt {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers and type 0 to exit.");
        int sum = 0;
        int n;
        int count = 0;
        while((n = scan.nextInt()) != 0){
            sum += n;
            count++ ;
        }
        System.out.println("Sum of integers is : "+ sum + " .Count of integers is : "+ count);
    }
}
