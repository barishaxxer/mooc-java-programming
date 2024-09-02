
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (true) {
            String next = scanner.nextLine();
            String[] array =next.split(",");
              if (next.trim().isEmpty()) {
                    break;
            }

            if (Integer.valueOf(array[1]) > i) {
                i = Integer.valueOf(array[1]);

            }

        }
        System.out.println("Age of the oldest: " + i);

    }
}
