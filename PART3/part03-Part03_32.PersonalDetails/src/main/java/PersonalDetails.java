
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        String name = "";
        int sum = 0;
        int counter = 0;

        while (true) {
            String next = scanner.nextLine();
              if (next.trim().isEmpty()) {
                break;
            }
            String[] array = next.split(",");
            sum += Integer.valueOf(array[1]);
            counter++;

            if (array[0].length() > i) {
                i = array[0].length();
                name = array[0];

            }

        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum / counter);


    }
}
