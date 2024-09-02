
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        if (num >= 18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }
        // Write your program here 
    }
}
