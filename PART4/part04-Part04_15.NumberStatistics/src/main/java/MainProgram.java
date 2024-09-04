
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statistics_even = new Statistics();
        Statistics statistics_odd = new Statistics();
        
        while (true) {
            System.out.println("Enter numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }else if (number % 2 == 0) {
                statistics_even.addNumber(number);
                
            }else{
                statistics_odd.addNumber(number);
            }
            statistics.addNumber(number);
            
            
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics_even.sum());
        System.out.println("Sum of odd numbers: " + statistics_odd.sum());
    }
}
