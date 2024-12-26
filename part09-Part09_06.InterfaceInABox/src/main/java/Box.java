
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
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> list;
    public Box(double capacity){
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }
    
    @Override
    public double weight() {
        double sum = 0;
        for(Packable  b : this.list ){
            sum += b.weight();
        }
        return sum;
    }
    
    public void add(Packable it){
        double sum = 0;
        for(Packable  b : this.list ){
            sum += b.weight();
        }
        if (it.weight() + sum <= this.capacity) {
            this.list.add(it);
            
            
        }
    }
    public String toString(){
        return "Box: " + this.list.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
    
    
}
