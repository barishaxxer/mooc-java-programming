
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
public class Hideout<T> {
    ArrayList<T> hide;
    
    public Hideout(){
        this.hide = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if (this.hide.contains(toHide)) {
            this.hide.remove(toHide);
            
            
            
        }else{
            this.hide.add(toHide);
        }
        
    }
    
    public T takeFromHideout(){
        if (!this.hide.isEmpty()) {
            return this.hide.get(this.hide.size() - 1);
        }
        
        return null;
        
        
    }
    public boolean isInHideout(){
        return !this.hide.isEmpty();
    }
    
    
}
