
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    public static List<Book> readBooks(String file) throws IOException{
        
        
        return Files.lines(Paths.get(file))
                .map(a -> a.split(","))
                .map(a -> new Book(a[0], Integer.valueOf(a[1]), Integer.valueOf(a[2]), a[3]))
                .collect(Collectors.toList());
                
    }

}
