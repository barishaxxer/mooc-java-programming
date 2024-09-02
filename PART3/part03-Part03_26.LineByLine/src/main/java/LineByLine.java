
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            String[] array = next.split(" ");
            for(String s : array){
                System.out.println(s);
            }
            
        }


    }
}
