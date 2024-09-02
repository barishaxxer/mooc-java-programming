
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = Integer.valueOf(scanner.nextLine());
        int e = Integer.valueOf(scanner.nextLine());

        if (d > e) {
            System.out.println(String.format("%d is greater than %d", d, e));
        } else if (e > d) {
            System.out.println(String.format("%d is smaller than %d", d, e));
        } else {
            System.out.println(String.format("%d is equal to %d", d, e));
        }
    }
}
