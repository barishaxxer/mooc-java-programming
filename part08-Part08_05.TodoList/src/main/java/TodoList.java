
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class TodoList {
    private ArrayList<String> list;
    public TodoList(){
        this.list = new ArrayList<>();
    } 
    public void add(String task){
        this.list.add(task);
        
    }
    public void print(){
        int counter = 1;
        for(String j : this.list){
            System.out.println(counter + ": " + j);
            counter++;
        }
    }
    public void remove(int number){
        this.list.remove(number - 1);
    }
    
}
