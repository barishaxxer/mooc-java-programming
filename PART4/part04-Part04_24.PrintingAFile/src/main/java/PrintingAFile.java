
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try ( Scanner scan = new Scanner(Paths.get("data.txt"))) {
            while (scan.hasNextLine()) {
                String next = scan.nextLine();
                System.out.println(next);

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
