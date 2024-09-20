
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barisck
 */
public class TodoList {
    private ArrayList<String> todo;
    
    public TodoList(){
    this.todo = new ArrayList<>();
}
    
    public void add(String task){
        todo.add(task);
    }
    public void print(){
        int counter = 1;
        for(String j : todo){
            System.out.println(String.format("%d: %s",counter,j));
            counter++;
        }
    }
    public void remove(int number){
        todo.remove(number - 1);
    }
}
