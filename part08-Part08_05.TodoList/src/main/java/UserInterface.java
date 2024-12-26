
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class UserInterface {
    private Scanner scan;
    private TodoList todo;
    
    public UserInterface(TodoList todo,Scanner scan){
        this.scan = scan;
        this.todo = todo;
    }
    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = this.scan.nextLine();
            System.out.println("");
            if (command.equals("stop")) {
                break;
                
            }else if (command.equals("add")) {
                System.out.print("To add: ");
                this.todo.add(this.scan.nextLine());
                
            }else if (command.equals("list")) {
                todo.print();
                
            }else if (command.equals("remove")) {
                System.out.print("Which one is removed?");
                this.todo.remove(Integer.valueOf(this.scan.nextLine()));
                
            }
            
            
        }
    }
    
}
