import java.util.Scanner;
public class TomJerry {
    public void oddEven() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) {
            if ((n > 20) && (n < 30)) {
                System.out.println("Jerry");

            }
        } else {
            if ((n > 20) && (n < 30)) {
                System.out.println("Tom");
            }
        }
    }
    public static void main(String[] args){
        TomJerry obj = new TomJerry();
        obj.oddEven();
    }
}
