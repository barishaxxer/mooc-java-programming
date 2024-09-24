
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        jokes = new ArrayList<>();
    }
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    public String drawJoke(){
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
            
        }
        Random rand = new Random();
        int num = rand.nextInt(this.jokes.size());
        return this.jokes.get(num);
    }
    public void printJokes(){
        for(String j : this.jokes){
            System.out.println(j);
        }
    }
    
}
