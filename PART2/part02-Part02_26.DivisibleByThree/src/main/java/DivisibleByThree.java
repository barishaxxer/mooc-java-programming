
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(9, 12);

    }

    public static void divisibleByThreeInRange(int beginning, int end){
        for (; beginning <= end; beginning++) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
                
            }
            
        }
    }
}
