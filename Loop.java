import java.util.Scanner;

public class Loop {
    public static void main (String[] args) {
        System.out.println("Enter no. of iteration: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for (int j= 0 ; j<i ;j++){
                System.out.print(i + " ");
            }
        }
    }

}
