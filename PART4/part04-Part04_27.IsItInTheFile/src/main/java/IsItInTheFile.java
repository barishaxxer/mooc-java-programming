
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        try(Scanner read = new Scanner(Path.of(file))){
            while (read.hasNextLine()) {
                String next = read.nextLine();
                list.add(next);
                
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        if (list.contains(searchedFor)) {
            System.out.println("Found!");
            
        }else{
            System.out.println("Not found.");
        }

    }
}
