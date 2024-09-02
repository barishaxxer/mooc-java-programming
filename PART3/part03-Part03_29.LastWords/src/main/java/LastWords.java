
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] next = scanner.nextLine().split(" ");
            System.out.println(next[next.length - 1]);

        }

    }
}
