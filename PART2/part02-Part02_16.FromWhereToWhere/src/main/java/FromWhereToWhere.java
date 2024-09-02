
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        for(;start <= end;start++){
            System.out.println(start);
        }

        // Write your program here
    }
}
