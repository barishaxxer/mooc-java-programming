
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
public class Pipe<T> {
    private ArrayList<T> pp;
    
    public Pipe(){
        this.pp = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pp.add(value);
        
    }
    public T takeFromPipe(){
        if (this.pp.isEmpty()) {
            
            return null;
            
        }
        return this.pp.get(0);
    }
    
    public boolean isInPipe(){
        return !this.pp.isEmpty();
        
    }
    
    
}
