import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
                
            }
            System.out.println("");
            System.out.print("Pages: ");
            String page = scan.nextLine();
            System.out.println("");
            System.out.print("Publication year: ");
            String pubYear = scan.nextLine();
            books.add(new Book(name, page, pubYear));
            
        }
        System.out.println("");
        System.out.print("What information will be printed?");
        if(scan.nextLine().equals("everything")){
            for(Book i : books){
                System.out.println(i);
            }
            
        }else{
            for(Book i : books){
                System.out.println(i.getName());
            }
        }
    }
}
