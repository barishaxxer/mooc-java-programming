
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try ( Scanner read = new Scanner(Path.of(file))) {
            while (read.hasNextLine()) {
                int next = Integer.valueOf(read.nextLine());
                if (lowerBound <= next && next <= upperBound) {
                    count++;
                }

            }

        } catch (Exception e) {
        }
        System.out.println("Numbers: " + count);

    }

}
