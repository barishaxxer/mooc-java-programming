
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
public class Room {
    
    private ArrayList<Person> persons;
    
    public Room(){
        persons = new ArrayList<>();
        
    }
    
    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty(){
        if (persons.isEmpty()) {
            return true;
            
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return persons;
    }
    
    public Person shortest(){
        if (this.isEmpty()) {
            return null;
            
        }
        Person fValue = persons.get(0);
        for(Person p : persons){
            if (p.getHeight() < fValue.getHeight()) {
                fValue = p;
                
            }
        }
        return fValue;
    }
    
    public Person take(){
       Person shortest = this.shortest();
       persons.remove(shortest);
       return shortest;
    }
}
