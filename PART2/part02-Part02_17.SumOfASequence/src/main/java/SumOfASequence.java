
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = num * (num + 1) / 2;
        System.out.println("The sum is " + sum);
    }
}
