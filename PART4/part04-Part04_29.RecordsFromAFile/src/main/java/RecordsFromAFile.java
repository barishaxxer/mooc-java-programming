
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String name = scanner.nextLine();
        try ( Scanner read = new Scanner(Path.of(name))) {
            while (read.hasNextLine()) {

                String[] list = read.nextLine().split(",");
                System.out.println(list[0] + ", age: " + list[1] + " years");
            }
        }catch(Exception e){
            
        }

    }
}
