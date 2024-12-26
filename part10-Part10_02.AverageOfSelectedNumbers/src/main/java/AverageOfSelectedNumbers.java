
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average;
        // toteuta ohjelmasi tänne
        ArrayList<String> inputList = new ArrayList<>();
        while (true) {
            String hold = scanner.nextLine();
            if (hold.equals("end")) {
                break;
                
            }
            inputList.add(hold);
            
            
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String np = scanner.nextLine();
        if (np.equals("n")) {
            average = inputList.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
            
        }else if (np.equals("p")) {
                average = inputList.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(i -> i > 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
            
            
        }
         


    }
}
