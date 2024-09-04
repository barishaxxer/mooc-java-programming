
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = 0;
        int wins = 0;
        System.out.println("File:");
        String name = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        try(Scanner read = new Scanner(Path.of(name))) {
            while (read.hasNextLine()) {
                String[] next = read.nextLine().split(",");
                if (team.equals(next[0])) {
                    games++;
                    if (Integer.valueOf(next[2]) > Integer.valueOf(next[3])) {
                        wins++;
                    }
                    
                }else if (team.equals(next[1])) {
                    games++;
                    if (Integer.valueOf(next[3]) > Integer.valueOf(next[2])) {
                        wins++;
                    }
                    
                }
                
            }
            
        } catch (Exception e) {
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (games - wins));

    }

}
