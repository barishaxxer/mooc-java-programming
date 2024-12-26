
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args)  {
        try{
            
        
        Files.lines(Paths.get("literacy.csv")).map(l -> l.split(",")).sorted((l1, l2) -> Double.compare(
                        Double.valueOf(l1[l1.length - 1].trim()), 
                        Double.valueOf(l2[l2.length - 1].trim())
                ))
                .forEach((String[] a) -> System.out.println(a[3] + " " + "(" + a[4] + "), " + a[2].split(" ")[1] + ", " + a[5]));
        }catch (IOException e){
            System.out.println("error");
        }
    }
}
