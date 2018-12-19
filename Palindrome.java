import java.util.Scanner;
public class Palindrome {

    public void palindrome(){
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int number = n;
        int reverse = 0;
        int sum = 0;
        boolean flag = false;
        int rem;
        while(n!=0){
            rem = n%10;
            if(rem%2 == 0){
                sum = sum+rem;
            }
            reverse = (reverse*10)+rem;
            n=n/10;
        }
        if(reverse == number){
            System.out.println("Given number is a palindrome.");
            flag = true ;
        }
        else {
            System.out.println("Given number is not a Palindrome.");
        }
        if ( flag == true ) {
            System.out.println("Sum of all even numbers is : "+ sum);
            if(sum > 25) {
                System.out.println("Sum of all even numbers is greater than 25");
            }
            else{
                System.out.println("Sum of all even numbers is not greater than 25");

            }
        }


    }

    public static void main (String[] args){

        Palindrome p_object = new Palindrome();
        p_object.palindrome();
    }

}
