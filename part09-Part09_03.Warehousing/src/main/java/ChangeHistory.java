
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
public class ChangeHistory {
    ArrayList<Double> list;
    public ChangeHistory(){
        list =  new ArrayList<>();
    }
    
    public void add(double status){
        this.list.add(status);
        
    }
    
    public void clear(){
        this.list.clear();
    }
    public double maxValue(){
        if (this.list.isEmpty()) {
            return 0;
            
        }
        double holder = this.list.get(0);
        for(double i : this.list){
            if (i > holder) {
                holder = i;
                
            }
        }
        return holder;
    }
    public double minValue(){
        if (this.list.isEmpty()) {
            return 0;
            
        }
        double holder = this.list.get(0);
        for(double i : this.list){
            if (i < holder) {
                holder = i;
            }
        }
        return holder;
    }
    public double average(){
        if (this.list.isEmpty()) {
            return 0;
            
        }
        double holder = 0;
        for(double i : this.list){
            holder += i;
        }
        return 1.0 * holder / this.list.size();
    }
    public String toString(){
        return this.list.toString();
    }
}
    