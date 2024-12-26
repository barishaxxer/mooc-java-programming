
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bariscankaya
 */
public class Employees {
    private ArrayList<Person> list;
    public Employees(){
        this.list =  new ArrayList<>();
    }
    public void add(Person personToAdd){
        this.list.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        this.list.addAll(peopleToAdd);
    }
    public void print(){
        this.list.stream().forEach(System.out::println);
        
    }
    public void print(Education education){
        this.list.stream().filter(arg0)
    }
}
