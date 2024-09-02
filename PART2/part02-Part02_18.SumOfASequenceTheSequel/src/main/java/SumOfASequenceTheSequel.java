
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int start = Integer.valueOf(scanner.nextLine());       
        System.out.print("Last number?");
        int end = Integer.valueOf(scanner.nextLine());
        int sum = (end * (end + 1) / 2) - (start * (start - 1) / 2);
        System.out.println("The sum is " + sum);
    }
}
