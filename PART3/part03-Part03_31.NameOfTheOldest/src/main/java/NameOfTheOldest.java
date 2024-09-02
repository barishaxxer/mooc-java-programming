
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        String name = "";

        while (true) {
            String next = scanner.nextLine();
              if (next.trim().isEmpty()) {
                break;
            }
            String[] array = next.split(",");
          

            if (Integer.valueOf(array[1]) > i) {
                i = Integer.valueOf(array[1]);
                name = array[0];

            }

        }
        System.out.println("Name of the oldest: " + name);

    }

}
