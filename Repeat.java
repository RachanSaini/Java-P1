import java.util.Scanner;

public class Repeat {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.nextLine();
        char[] sarray = s.toCharArray();
        System.out.println("Enter number of iterations: ");
        int n = scan.nextInt();
        int repeat = n ;
        System.out.print(s);
        for(int i=sarray.length-1 ; i>n ; i-- ){
                while(repeat!=0){
                    System.out.print(s.substring(s.length()-n));
                    repeat--;
            }
        }
    }
}
