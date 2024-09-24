
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

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager,Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            String com = this.scanner.nextLine();
            if (com.equals("X")) {
                break;

            } else if (com.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.manager.addJoke(joke);

            } else if (com.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.manager.drawJoke());

            } else if (com.equals("3")) {
                System.out.println("Printing the jokes.");
                this.manager.printJokes();

            }

        }
    }

}
