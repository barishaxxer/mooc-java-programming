
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println(String.format("First: %d/100", first));
            System.out.println(String.format("Second: %d/100", second));

            String[] input = scan.nextLine().split(" ");

            if (input[0].equals("quit")) {
                break;
            } else if (input[0].equals("add") && Integer.valueOf(input[1]) > 0) {
                if ((first += Integer.valueOf(input[1])) > 100) {
                    first = 100;
                }

            } else if (input[0].equals("move") && Integer.valueOf(input[1]) > 0) {
                if (first < Integer.valueOf(input[1])) {
                    second += first;
                    first = 0;

                } else {
                    second += Integer.valueOf(input[1]);
                    first -= Integer.valueOf(input[1]);
                }
                if (second > 100) {
                    second = 100;
                }
            } else if (input[0].equals("remove") && Integer.valueOf(input[1]) > 0) {
                second -= Integer.valueOf(input[1]);
                if (second < 0) {
                    second = 0;

                }
            }

        }

    }
}
