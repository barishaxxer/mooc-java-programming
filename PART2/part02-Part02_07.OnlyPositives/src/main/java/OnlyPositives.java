
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");

            int d = Integer.valueOf(scanner.nextLine());
            if (d == 0) {
                break;
                
            } else if (d < 0) {
                System.out.println("Unsuitable number");
                continue;
            } 
            System.out.println(Math.pow(d, 2));

        }
    }
}
