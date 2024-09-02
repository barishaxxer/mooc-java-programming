
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String fr = scan.nextLine();
        System.out.println("Enter the second string");
        String sec = scan.nextLine();
        if(fr.equals(sec)){
            System.out.println("Same");
            
        }else{
            System.out.println("Different");
        }
        // Write your program here. 
    }
}
