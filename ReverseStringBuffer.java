import java.util.Scanner;
public class ReverseStringBuffer {
    public static void main (String[] args) {
        System.out.println("Enter a string.");
        Scanner scan = new Scanner(System.in);
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append(scan.nextLine());
        sbuffer.reverse();
        System.out.println(sbuffer);

    }
}
