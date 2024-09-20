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
public class UserInterface {
    private TodoList obj;
    private Scanner scanner;
    public UserInterface(TodoList todo, Scanner scanner){
        this.obj = todo;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
                
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = this.scanner.nextLine();
                this.obj.add(toAdd);
                
            }
            if (command.equals("list")) {
                this.obj.print();
                
            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int num = this.scanner.nextInt();
                this.obj.remove(num);
                
            }
        }
    }
}
