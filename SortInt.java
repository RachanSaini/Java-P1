import java.util.Arrays;
import java.util.Scanner;
public class SortInt{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int number = n;
        // sum of even numbers...
        int sum = 0;
        int digit;
        while(number!=0){
            digit = number%10;
            if(digit%2 == 0){
                sum += digit;
            }
            number=number/10;

        }


        // sort int ....


        String s = Integer.toString(n);
        char[] sarray = s.toCharArray();
        Arrays.sort(sarray);
        System.out.println(sarray);
        StringBuffer buff = new StringBuffer();
        buff.append(sarray);
        buff.reverse();
        System.out.println(buff);



        System.out.println("Sum of all even numbers is : "+ sum);

        // sum greator than 15...
        if(sum>15){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}