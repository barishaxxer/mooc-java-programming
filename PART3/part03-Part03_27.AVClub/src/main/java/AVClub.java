
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            String[] array = next.split(" ");
            for(String s : array){
                if (s.contains("av")) {
                    System.out.println(s);
                }
            }
            
        }


    }
}
