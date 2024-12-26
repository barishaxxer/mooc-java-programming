
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> inputList = new ArrayList<>();
        while (true) {
            String hold = scanner.nextLine();
            if (hold.equals("end")) {
                break;
                
            }
            inputList.add(hold);
            
            
        }
        double average = inputList.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);

    }
}
