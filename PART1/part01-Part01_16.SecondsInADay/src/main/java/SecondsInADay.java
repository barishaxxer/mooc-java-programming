
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int day = Integer.valueOf(scanner.nextLine());
        System.out.println(day * 24 * 3600);
        
        // Write your program here

    }
}
