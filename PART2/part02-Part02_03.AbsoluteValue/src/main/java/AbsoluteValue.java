
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = Integer.valueOf(scanner.nextLine());
        if (d < 0){
            System.out.println(d * -1);
        }else{
            System.out.println(d);
        }

    }
}
