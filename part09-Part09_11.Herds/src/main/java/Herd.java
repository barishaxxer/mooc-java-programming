
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
public class Herd implements Movable{
    private ArrayList<Movable> organisms;
    
    public Herd(){
        this.organisms = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        this.organisms.add(movable);
    }
    
    
    @Override
    public void move(int dx, int dy) {
        for(Movable o : this.organisms){
            o.move(dx, dy);
        }
    
    }
    
    public String toString(){
        String result = "";
        for(Movable m : this.organisms){
            result = result + m + "\n";
        }
        return result;
    }
    
}
