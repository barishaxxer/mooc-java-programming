
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a word: ");
        String s = scanner.nextLine();
        System.out.println(s.repeat(3));
        // Write your program here

    }
}
