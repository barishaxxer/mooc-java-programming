
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barisck
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner,SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start(){
        while (true) {            
            
        
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                dict.add(word, translation);
                
            }else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String searched = this.scanner.nextLine();
                if (dict.translate(searched) == null) {
                    System.out.println("Word " + searched + " was not found");
                    continue;
                    
                }
                System.out.print("Translation: " + dict.translate(searched) + "\n");
                
            }else{
                System.out.println("Unknown command");
            }
            
            }
    }
}
